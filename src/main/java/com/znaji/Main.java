package com.znaji;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.znaji.entities.Bean;
import com.znaji.entities.ExtendableModel;
import com.znaji.entities.User;

public class Main {
    public static void main(String[] args) {
        final User user = new User("John", "john@gmail.com");
        final ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        try {
            final String userJson = mapper.writeValueAsString(user);
            System.out.println(userJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}