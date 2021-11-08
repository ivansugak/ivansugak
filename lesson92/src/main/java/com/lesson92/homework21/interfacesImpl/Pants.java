package com.lesson92.homework21.interfacesImpl;

public class Pants implements com.lesson92.homework21.interfacies.Pants {
    @Override
    public void putOn() {
        System.out.println("put on the pants");
    }

    @Override
    public void takeOff() {
        System.out.println("take off the pants");
    }
}
