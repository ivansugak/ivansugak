package com.lesson92.homework31.model;


import com.lesson92.homework31.interfacies.IStart;

public class Shuttle implements IStart {

    @Override
    public boolean checkSystem() {
        int random = (int) (Math.random() * 10);
        if (random > 3) {
            System.out.println("System checked");
            return true;
        } else {
            System.out.println("System not checked");
            return false;
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
