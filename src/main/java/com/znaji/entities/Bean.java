package com.znaji.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"value", "name"})
public class Bean {
    private String name;
    private String value;

    public Bean(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @JsonGetter("name")
    public String name() {
        return name;
    }

    @JsonGetter("value")
    public String value() {
        return value;
    }

}
