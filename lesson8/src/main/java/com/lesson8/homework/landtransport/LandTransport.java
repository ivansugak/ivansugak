package com.lesson8.homework.landtransport;

import com.lesson8.homework.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LandTransport extends Transport {

    private int amountWheel;
    private double fuelConsumption;

    public LandTransport(int power,
                         int maxSpeed,
                         int weight,
                         String model,
                         int amountWheel,
                         double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.amountWheel = amountWheel;
        this.fuelConsumption = fuelConsumption;
    }
}
