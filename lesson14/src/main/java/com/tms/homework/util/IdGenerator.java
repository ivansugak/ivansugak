package com.tms.homework.util;

public class IdGenerator {

    private static int id = 1;

    private IdGenerator() {
    }

    public static int generateBookId() {
        return id++;
    }
}
