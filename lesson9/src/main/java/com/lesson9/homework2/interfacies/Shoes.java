package com.lesson9.homework2.interfacies;

public interface Shoes {
    default void put_onShoes(){
        System.out.println("put on shoes");
    }

    default void take_offShoes(){
        System.out.println("take off shoes");
    }
}
