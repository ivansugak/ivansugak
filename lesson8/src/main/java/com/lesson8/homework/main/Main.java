package com.lesson8.homework.main;

import com.lesson8.homework.landtransport.FreightTransport;
import com.lesson8.homework.landtransport.LightTransport;
import com.lesson8.homework.ligthtransport.CivilTransport;
import com.lesson8.homework.ligthtransport.MilitaryTransport;

import java.time.LocalDateTime;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
//        LightTransport transport1 = new LightTransport(
//                20,
//                50,
//                100,
//                "Tesla",
//                4,
//                10,
//                "Sedan",
//                4);
//        transport1.displayInfo();
//        LocalDateTime start = LocalDateTime.of(2021, Month.OCTOBER, 15, 9, 15, 0);
//        LocalDateTime finish = LocalDateTime.of(2021, Month.OCTOBER, 15, 11, 15, 0);;
//        transport1.displayDistance(start, finish);
//_____________________________________________________________________________________________
//        FreightTransport transport1 = new FreightTransport(
//                150,
//                100,
//                3000,
//                "MAN",
//                4,
//                90.0,
//                5000);
//        transport1.displayInfo();
//        transport1.displayCarryingCapacity(5500);
//_____________________________________________________________________________________________
//        CivilTransport transport1 = new CivilTransport(
//                100,
//                150,
//                2000,
//                "AIR",
//                20,
//                1000,
//                30,
//                false
//                );
//        transport1.displayInfo();
//        transport1.displayAmountPassenger(2);
//_____________________________________________________________________________________________
        MilitaryTransport transport1 = new MilitaryTransport(
                100,
                600,
                2000,
                "AIR2",
                20,
                1000,
                false,
                4
                );
        transport1.displayInfo();
        transport1.displayShot(0);
        transport1.displayEjection();
    }
}
