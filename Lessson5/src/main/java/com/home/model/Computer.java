package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String CPU;
    private int RAM;
    private int HDD;
    private final static int LIFECYCLE = 5;
    private boolean on_off = true;
    private int numON_OFF = 0;

    public Computer(String CPU, int RAM, int HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public void on() {
        if (!on_off | numON_OFF > LIFECYCLE) {
            System.out.println("Компьютер сгорел!");
        } else {
            System.out.println("Внимание! Введите 0 или 1");
            Random random = new Random();
            int number = random.nextInt(2);
            Scanner scanner = new Scanner(System.in);
            int numbers = scanner.nextInt();
            numON_OFF++;
            if (numbers == number) {
                System.out.println("Компьютер включился! Работаем!");
                off();
            } else {
                System.out.println("БАЦ");
                on_off = false;
            }
        }
    }

    public void off() {
        System.out.println("Компьютер выключен!");
        on();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                '}';
    }
}
