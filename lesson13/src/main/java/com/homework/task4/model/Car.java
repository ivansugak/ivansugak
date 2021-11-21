package com.homework.task4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
public class Car implements Serializable {

    private String model;
    private final Engine engine;
    private Gastank gastank;
    private int speed;
    private float price;

}
