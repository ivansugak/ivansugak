package com.homework.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String string = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("\\w+\\s+\\d+");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(string.substring(start, end));
        }
    }
}
