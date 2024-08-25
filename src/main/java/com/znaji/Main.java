package com.znaji;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.znaji.entities.Bean;
import com.znaji.entities.ExtendableModel;

public class Main {
    public static void main(String[] args) {
        final Bean bean = new Bean("name", "value");
        final ObjectMapper mapper = new ObjectMapper();
        try {
            final String json = mapper.writeValueAsString(bean);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}