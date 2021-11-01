package com.lesson9.homework2.interfacies;

public interface Pants {
    default void put_onPants() {
        System.out.println("put on pants");
    }

    default void take_offPants(){
        System.out.println("take off pants");
    }
}
