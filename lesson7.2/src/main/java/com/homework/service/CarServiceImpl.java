package com.homework.service;

import com.homework.model.Car;

public class CarServiceImpl implements CarService {

    private Car car;
    private GastankServiceImpl gastankService = new GastankServiceImpl(car.getGastank());
    private EngineServiceImpl engineService = new EngineServiceImpl(car.getEngine());

    public CarServiceImpl(Car car) {
        this.car = car;
    }

    @Override
    public void onCar() {
        if (gastankService.checkGastank()) {
            engineService.start();
            System.out.println("Car work");
        } else {
            System.out.println("Gastank is empty!");
        }
    }

    @Override
    public void offCar() {
        System.out.println("Car is off");
        engineService.start();
        int copyFuelCapacity = car.getGastank().getFuelCapacity();
        copyFuelCapacity -= 50;
        car.getGastank().setFuelCapacity(copyFuelCapacity);
        int copyTotalMileage = car.getTotalMileage();
        copyTotalMileage += car.getMileageGastank();
        car.setTotalMileage(copyTotalMileage);
        System.out.println("TotalMileage is " + car.getTotalMileage());
    }

    @Override
    public void drive() {
        if (gastankService.checkGastank()) {
            onCar();
            System.out.println("Car rides");
        } else {
            System.out.println("Car can't ride! Gastank is empty!");
        }
    }
}
