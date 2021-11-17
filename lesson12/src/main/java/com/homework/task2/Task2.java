package com.homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

        String string = "cab, ccab, cccab";
        Pattern pattern = Pattern.compile("\\w*\\w+");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(string.substring(start, end));
        }
    }
}
