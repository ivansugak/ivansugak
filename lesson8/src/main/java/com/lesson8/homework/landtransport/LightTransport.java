package com.lesson8.homework.landtransport;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LightTransport extends LandTransport {

    private String bodyType;
    private int amountPassenger;
    private double powerLightTransport = super.getPower() * 0.74;

    public LightTransport(int power,
                          int maxSpeed,
                          int weight,
                          String model,
                          int amountWheel,
                          double fuelConsumption,
                          String bodyType,
                          int amountPassenger) {
        super(power, maxSpeed, weight, model, amountWheel, fuelConsumption);
        this.bodyType = bodyType;
        this.amountPassenger = amountPassenger;
    }

    public void displayInfo() {
        System.out.println("LightTransport has power = " + super.getPower() + ", maxSpeed = " + super.getMaxSpeed() +
                ", weight = " + super.getWeight() + ", model = " + super.getModel() +
                ", amountWheel = " + super.getAmountWheel() + ", fuelConsumption = " + super.getFuelConsumption() +
                ", bodyType = " + bodyType + ", amountPassenger = " + amountPassenger +
                ", powerLightTransport = " + powerLightTransport);
    }

    public void displayDistance(LocalDateTime start, LocalDateTime finish) {
        int distanceYear = finish.getYear() - start.getYear();
        int leapYear = distanceYear / 4;
        int distanceDay = finish.getDayOfYear() - start.getDayOfYear();
        int distanceHour = finish.getHour() - start.getHour();
        int distanceHourAll = (distanceYear * 365 + distanceDay + leapYear + distanceDay) * 24 + distanceHour;
        float distance = getMaxSpeed() * distanceHourAll;
        double amountFuel = distance / 100 * getFuelConsumption();
        System.out.println("За время " + distanceHour + " ч, автомобиль " + getModel() + "\n" +
                "двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч\n" +
                "проедет " + distance + "км и израсходует " + amountFuel + " литров топлива.");
    }
}
