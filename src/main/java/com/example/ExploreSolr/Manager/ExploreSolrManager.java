package com.example.ExploreSolr.Manager;

import com.example.model.SolrIndex;
import com.example.model.SolrResult;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ExploreSolrManager {

    @Autowired
    SolrResult solrResult;

    @Value("${url.base.solr}")
    private String baseSolrUrl;

    /**
     * Accepts field and value, conducts search and returns Solr search results.
     *
     * @param field String field name to search.
     * @param value String value to search for in the field.
     * @return ResponseEntity<SolrResult> containing the result of Solr search.
     */
    public ResponseEntity<SolrResult> getSolrResultResponseEntity(String field, String value) {
        try {
            SolrClient client = new HttpSolrClient.Builder(baseSolrUrl).build();
            SolrQuery query = new SolrQuery();
            query.set("q", String.format("%s:%s", field, value));
            QueryResponse response = client.query(query);

            solrResult.setNumDocs(response.getResults().getNumFound());
            solrResult.setSolrIndex(response.getBeans(SolrIndex.class));

            return new ResponseEntity<>(solrResult, HttpStatus.OK);
        } catch (SolrServerException | IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
