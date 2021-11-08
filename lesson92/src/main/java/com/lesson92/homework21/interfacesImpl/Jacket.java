package com.lesson92.homework21.interfacesImpl;

public class Jacket implements com.lesson92.homework21.interfacies.Jacket {
    @Override
    public void putOn() {
        System.out.println("put on the jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("take off the jacket");
    }
}
