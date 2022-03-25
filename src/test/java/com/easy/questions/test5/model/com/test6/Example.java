package com.easy.questions.test5.model.com.test6;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import sun.reflect.generics.tree.Tree;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "target",
    "tree"
})
@Generated("jsonschema2pojo")
public class Example {

    @JsonProperty("target")
    private Integer target;
    @JsonProperty("tree")
    private BST tree;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("target")
    public Integer getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Integer target) {
        this.target = target;
    }

    @JsonProperty("tree")
    public BST getTree() {
        return tree;
    }

    @JsonProperty("tree")
    public void setTree(BST tree) {
        this.tree = tree;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
