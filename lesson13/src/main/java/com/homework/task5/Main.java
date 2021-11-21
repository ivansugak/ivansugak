package com.homework.task5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.homework.hw5.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bis = new BufferedReader(new FileReader("lesson13//src//main//java//com//homework//hw5//car.json"))) {
            String jsonString = "";
            String jsonString1;
            while ((jsonString1 = bis.readLine()) != null) {
                String s = jsonString1.replaceAll("[_]", "");
                String t = s.replace("s", "S");
                String m = t.replace("name", "");
                jsonString = jsonString + jsonString1;

            }

            StringReader reader = new StringReader(jsonString);
            ObjectMapper mapper = new ObjectMapper();

            Car car = mapper.readValue(reader, Car.class);
            System.out.println(car);
        }
    }
}
