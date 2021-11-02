package com.lesson9.homework3.model;

import com.lesson9.homework3.interfacies.IStart;

public class Cosmodrome implements IStart{

    public void launch(IStart iStart){
        checkSystem(true);
        iStart.checkSystem(true);

    }

    @Override
    public void checkSystem(boolean forStart) {
        if (forStart){
            startEngine();
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
            start();
        } else {
            System.out.println("System check failed!");
        }
    }

    @Override
    public void startEngine() {
    }

    @Override
    public void start() {
    }
}
