package com.example.ExploreSolr.Controller;

import com.example.ExploreSolr.Manager.ExploreSolrManager;
import com.example.model.SolrResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solr")
public class ExploreSolrController {

    @Autowired
    ExploreSolrManager exploreSolrManager;

    /**
     * Accepts two String parameters and returns an array containing two strings with those parameters.
     *
     * @param paramA First String parameter.
     * @param paramB Second String parameter.
     * @return ResponseEntity<String[]> with the array containing two modified values.
     */
    @RequestMapping("/hello-world")
    public ResponseEntity<String[]> helloWorld(@RequestParam String paramA, @RequestParam String paramB) {
        String[] returnArray = {"Got it : "+paramA, "Got it too : "+paramB};
        return new ResponseEntity<>(returnArray, HttpStatus.OK);
    }

    /**
     * Performs a search on the Solar instance configured with the field and value provided.
     *
     * @param field Solr field to search.
     * @param value The value corresponding to the field to search for.
     * @return ResponseEntity<SolrResult> containing the result
     */
    @RequestMapping("/search")
    public ResponseEntity<SolrResult> search(@RequestParam String field, @RequestParam String value) {
        return exploreSolrManager.getSolrResultResponseEntity(field, value);
    }

}
