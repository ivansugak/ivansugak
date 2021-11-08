package com.lesson92.homework21.util;

import com.lesson92.homework21.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Петя");
        person.get_dressed();
        person.undress();
    }
}
