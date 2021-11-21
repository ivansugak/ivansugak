package com.homework.task4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
public class Engine implements Serializable {

    private String type;
    private transient int amountOfCylinders;

}
