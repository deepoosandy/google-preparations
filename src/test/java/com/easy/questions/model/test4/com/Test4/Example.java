package com.easy.questions.model.test4.com.Test4;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Example implements Serializable {

    private List<List<String>> competitions = null;
    private List<Integer> results = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<List<String>> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<List<String>> competitions) {
        this.competitions = competitions;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
