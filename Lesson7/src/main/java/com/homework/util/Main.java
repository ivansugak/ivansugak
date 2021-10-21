package com.homework.util;

import com.homework.model.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2019);

        car.drive();
        car.offCar();
        car.drive();
        car.offCar();
        car.drive();

    }
}
