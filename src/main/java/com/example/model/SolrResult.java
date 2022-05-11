package com.example.model;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Represents the Solr search result.
 */
@ApiModel(description = "Represents the Solr search result.")
@Component
public class SolrResult {
    private Long numDocs;
    private List<SolrIndex> solrIndex;

    public Long getNumDocs() {
        return numDocs;
    }

    public void setNumDocs(Long numDocs) {
        this.numDocs = numDocs;
    }

    public List<SolrIndex> getSolrIndex() {
        return solrIndex;
    }

    public void setSolrIndex(List<SolrIndex> solrIndex) {
        this.solrIndex = solrIndex;
    }

    @Override
    public String toString() {
        return "SolrResult{" +
                "numDocs=" + numDocs +
                ", solrIndex=" + solrIndex +
                '}';
    }
}
