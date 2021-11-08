package com.homework;

import com.homework.exception.CarException;
import com.homework.model.Car;
import com.homework.serviceimpl.CarServiceImpl;

public class Main {
    public static void main(String[] args) throws CarException {
        Car car1 = new Car("Ford", 150, 1000);
        CarServiceImpl carServiceImpl1 = new CarServiceImpl(car1);
        carServiceImpl1.start();

        Car car2 = new Car("Jeep", 200, 2000);
        CarServiceImpl carServiceImpl2 = new CarServiceImpl(car2);
        carServiceImpl2.start();

        Car car3 = new Car("BMV", 300, 3000);
        CarServiceImpl carServiceImpl3 = new CarServiceImpl(car3);
        carServiceImpl3.start();

    }
}
