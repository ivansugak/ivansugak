package com.lesson92.homework21.interfacesImpl;

public class Shoes implements com.lesson92.homework21.interfacies.Shoes {
    @Override
    public void putOn() {
        System.out.println("put on the shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("take off the shoes");
    }
}
