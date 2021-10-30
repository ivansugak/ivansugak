package com.lesson8.homework.ligthtransport;

import com.lesson8.homework.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirTransport extends Transport {

    private int wingspan;
    private int takeOffRunwayLength;

    public AirTransport(int power,
                        int maxSpeed,
                        int weight,
                        String model,
                        int wingspan,
                        int takeOffRunwayLength) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.takeOffRunwayLength = takeOffRunwayLength;
    }
}
