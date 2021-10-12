package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Intel", 4, 500);
        computer.off();
        computer.on();

        System.out.println("Что случилось?");

        computer.on();


    }
}
