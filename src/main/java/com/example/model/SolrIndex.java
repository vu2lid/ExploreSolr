package com.example.model;

import io.swagger.annotations.ApiModel;
import org.apache.solr.client.solrj.beans.Field;

import java.util.List;

/**
 * Represents the Solr index with a limited number of fields.
 */
@ApiModel(description = "Represents the Solr index with a limited number of fields.")
public class SolrIndex {
    private String id;
    private String name;
    private String price_c;
    private List<String> features;
    private List<String> cat;

    public String getId() {
        return id;
    }
    @Field
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @Field
    public void setName(String name) {
        this.name = name;
    }

    public String getPrice_c() {
        return price_c;
    }
    @Field
    public void setPrice_c(String price_c) {
        this.price_c = price_c;
    }

    public List<String> getFeatures() {
        return features;
    }
    @Field
    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public List<String> getCat() {
        return cat;
    }
    @Field
    public void setCat(List<String> cat) {
        this.cat = cat;
    }
}
