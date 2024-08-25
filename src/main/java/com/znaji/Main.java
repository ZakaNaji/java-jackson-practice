package com.znaji;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.znaji.entities.ExtendableModel;

public class Main {
    public static void main(String[] args) {
        final ExtendableModel model = new ExtendableModel("model");
        model.add("key1", "value1");
        model.add("key2", "value2");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(model);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}