package com.homework.task1;

public class Task1 {
    public String getTwoCharacterFromWord(String string) {
        String[] words = string.split("");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        int centre = count / 2 - 1;
        return words[centre] + words[centre + 1] + "";
    }
}
