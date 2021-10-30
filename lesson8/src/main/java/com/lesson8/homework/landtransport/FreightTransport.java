package com.lesson8.homework.landtransport;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FreightTransport extends LandTransport {

    private int carryingCapacity;
    private double powerFreightTransport = super.getPower() * 0.74;

    public FreightTransport(int power,
                            int maxSpeed,
                            int weight,
                            String model,
                            int amountWheel,
                            double fuelConsumption,
                            int carryingCapacity) {
        super(power, maxSpeed, weight, model, amountWheel, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public void displayInfo() {
        System.out.println("FreightTransport has power = " + super.getPower() + ", maxSpeed = " + super.getMaxSpeed() +
                ", weight = " + super.getWeight() + ", model = " + super.getModel() +
                ", amountWheel = " + super.getAmountWheel() + ", fuelConsumption = " + super.getFuelConsumption() +
                ", carryingCapacity = " + carryingCapacity + ", powerFreightTransport = " + powerFreightTransport);
    }

    public void displayCarryingCapacity(int cargoWeight) {
        if (carryingCapacity >= cargoWeight) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
