package com.homework.task4;

public class Task4 {
    public static void main(String[] args) {
        String string = "One two three раз два три one1 two2 123 ";
        String[] string3 = string.split(" ");

        for (String s : string3) {
            boolean result = s.matches("\\b[a-zA-Z]+[a-zA-Z]\\b");
            if (result) {
                System.out.println(s);
            }
        }
    }
}
