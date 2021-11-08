package com.lesson92.homework21.model;

import com.lesson92.homework21.interfacesImpl.Shoes;
import com.lesson92.homework21.interfacies.Jacket;
import com.lesson92.homework21.interfacies.Pants;

public class Person {

    private String name;
    private Jacket jacket = new com.lesson92.homework21.interfacesImpl.Jacket();
    private Pants pants = new com.lesson92.homework21.interfacesImpl.Pants();
    private Shoes shoes = new Shoes();


    public Person(String name) {
        this.name = name;
    }

    public void get_dressed() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void undress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
