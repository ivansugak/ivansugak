package com.homework.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Car {

    private String model;
    private int age;
    private final int mileageGastank = 100;
    private int totalMileage = 0;
    private final Engine engine;
    private Gastank gastank;

    public Car(Engine engine, Gastank gastank) {
        this.engine = engine;
        this.gastank = gastank;
    }

    public Car(String model, int age, Engine engine, Gastank gastank) {
        this.model = model;
        this.age = age;
        this.engine = engine;
        this.gastank = gastank;
    }
}
