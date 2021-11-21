package com.homework.task4;

import com.homework.task4.model.Car;
import com.homework.task4.model.Engine;
import com.homework.task4.model.Gastank;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lesson13//Task4.dat"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lesson13//Task4.dat"))) {
            Car car = new Car("Ford",
                    new Engine("TDI", 4),
                    new Gastank("TDI", 100),
                    200, 10000f);
            oos.writeObject(car);

            Car carAfterSerializable = (Car) ois.readObject();
            System.out.printf("Model: %s, EngineType: %s, amountOfCylinders: %d, GastankType: %s, " +
                            "fuelCapacity: %d, speed: %d, price: %.1f", carAfterSerializable.getModel(), carAfterSerializable.getEngine().getType(),
                    carAfterSerializable.getEngine().getAmountOfCylinders(), carAfterSerializable.getGastank().getType(),
                    carAfterSerializable.getGastank().getFuelCapacity(), carAfterSerializable.getSpeed(), carAfterSerializable.getPrice());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
