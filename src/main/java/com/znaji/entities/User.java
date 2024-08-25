package com.znaji.entities;

import com.fasterxml.jackson.annotation.JsonValue;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
