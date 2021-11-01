package com.lesson9.homework2.interfacies;

public interface Jacket {
    default void put_onJacket() {
        System.out.println("put on the jacket");
    }
    default void take_offJacket() {
        System.out.println("take off the jacket");
    }

}
