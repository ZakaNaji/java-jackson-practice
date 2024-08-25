package com.znaji.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class ExtendableModel {
    public String name;
    private Map<String, String> properties;

    public ExtendableModel(String name) {
        this.name = name;
        properties = new java.util.HashMap<>();
    }

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public void add(String key, String value) {
        properties.put(key, value);
    }
}
