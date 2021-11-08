package com.homework.serviceimpl;

import com.homework.exception.CarException;
import com.homework.model.Car;
import com.homework.service.CarService;

public class CarServiceImpl implements CarService {

    Car car;

    public CarServiceImpl(Car car) {
        this.car = car;
    }

    @Override
    public void start() throws CarException {
        int random = (int) (Math.random() * 20);
        if (random % 2 == 0) {
            throw new CarException("Car is not ready");
        } else {
            System.out.println("Car model " + car.getModel() + " works");
        }
    }
}
