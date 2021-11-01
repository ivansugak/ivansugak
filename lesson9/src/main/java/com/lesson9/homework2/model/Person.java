package com.lesson9.homework2.model;

import com.lesson9.homework2.interfacies.Jacket;
import com.lesson9.homework2.interfacies.Pants;
import com.lesson9.homework2.interfacies.Shoes;

public class Person implements Jacket, Pants, Shoes{

    private  String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public void get_dressed(){
        put_onJacket();
        put_onPants();
        put_onShoes();
    }
    public void undress(){
        take_offJacket();
        take_offPants();
        take_offShoes();
    }
}
