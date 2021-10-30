package com.lesson8.homework.ligthtransport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CivilTransport extends AirTransport {

    private int amountPassenger;
    private boolean businessClass;
    private double powerCivilTransport = super.getPower() * 0.74;

    public CivilTransport(int power,
                          int maxSpeed,
                          int weight,
                          String model,
                          int wingspan,
                          int takeOffRunwayLength,
                          int amountPassenger,
                          boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, takeOffRunwayLength);
        this.amountPassenger = amountPassenger;
        this.businessClass = businessClass;
    }

    public void displayInfo() {
        System.out.println("CivilTransport has power = " + super.getPower() + ", maxSpeed = " + super.getMaxSpeed() +
                ", weight = " + super.getWeight() + ", model = " + super.getModel() +
                ", wingspan = " + super.getWingspan() + ", takeOffRunwayLength = " + super.getTakeOffRunwayLength() +
                ", amountPassenger = " + amountPassenger + ", businessClass = " + businessClass +
                ", powerCivilTransport = " + powerCivilTransport);
    }

    public void displayAmountPassenger( int passenger) {
        if (amountPassenger >= passenger) {
            System.out.println("Все пассажиры заняли свои места");
        } else {
            System.out.println("Вам нужно воздушное судно побольше");
        }
    }
}
