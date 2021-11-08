package com.lesson92.homework31.model;


import com.lesson92.homework31.interfacies.IStart;

public class Cosmodrome {

    public void launch(IStart iStart) {
        if (iStart.checkSystem()) {
            iStart.startEngine();
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
            iStart.start();
        } else {
            System.out.println("System check failed!");
        }
    }
}
