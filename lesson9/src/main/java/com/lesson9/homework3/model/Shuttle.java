package com.lesson9.homework3.model;

import com.lesson9.homework3.interfacies.IStart;

public class Shuttle implements IStart {
    @Override
    public void checkSystem(boolean forStart) {
        int random = (int) (Math.random() * 10);
        if (random > 3) {
            System.out.println("System checked");
            startEngine();
            start();
        } else {
            System.out.println("System not checked");
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Shuttle engines are running.\n" +
                "All systems are normal.");
    }

    @Override
    public void start() {
        System.out.println("Shuttle start");
    }
}
