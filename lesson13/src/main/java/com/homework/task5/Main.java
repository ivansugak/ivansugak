package com.homework.task5;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String json = "{\n" +
                "  \"brand_name\": \"Toyota\",\n" +
                "  \"model_name\": \"Camry\",\n" +
                "  \"max_speed\": 230,\n" +
                "  \"price\": 35000\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        com.homework.hw5.Car car = mapper.readValue(json, com.homework.hw5.Car.class);
        System.out.println(car);
    }
}


