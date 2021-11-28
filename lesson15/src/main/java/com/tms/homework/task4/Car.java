package com.tms.homework.task4;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
@Data
public class Car {
    private String number;
    private int age;

    public Car(String number, int age) {
        this.number = number;
        this.age = age;
    }

    public static List<Car> cars;

    public void printCars() {
        cars.stream()
                .filter(p -> (p.getNumber() != null && !p.getNumber().equals("") && p.getAge() > 2010))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
