package com.lesson8.homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String model;

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }
}
