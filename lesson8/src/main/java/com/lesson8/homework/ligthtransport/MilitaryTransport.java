package com.lesson8.homework.ligthtransport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MilitaryTransport extends AirTransport {

    private boolean ejectionSystem;
    private int amountRocket;
    private double powerMilitaryTransport = super.getPower() * 0.74;

    public MilitaryTransport(int power,
                             int maxSpeed,
                             int weight,
                             String model,
                             int wingspan,
                             int takeOffRunwayLength,
                             boolean ejectionSystem,
                             int amountRocket) {
        super(power, maxSpeed, weight, model, wingspan, takeOffRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.amountRocket = amountRocket;
    }

    public void displayInfo() {
        System.out.println("CivilTransport has power = " + super.getPower() + ", maxSpeed = " + super.getMaxSpeed() +
                ", weight = " + super.getWeight() + ", model = " + super.getModel() +
                ", wingspan = " + super.getWingspan() + ", takeOffRunwayLength = " + super.getTakeOffRunwayLength() +
                ", ejectionSystem = " + ejectionSystem + ", amountRocket = " + amountRocket +
                ", powerMilitaryTransport = " + powerMilitaryTransport);
    }

    public void displayShot(int amountRocket) {
        if (amountRocket > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void displayEjection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
