package com.homework;

import com.homework.model.Car;
import com.homework.model.Engine;
import com.homework.model.Gastank;
import com.homework.service.CarServiceImpl;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2019, new Engine(150), new Gastank(100));
        CarServiceImpl carService = new CarServiceImpl(car);

        carService.drive();
        carService.offCar();
        carService.drive();
        carService.offCar();
        carService.drive();
    }
}
