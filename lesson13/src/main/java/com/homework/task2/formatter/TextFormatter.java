package com.homework.task2.formatter;

public class TextFormatter {
    public static int countingWords(String string) {
        String[] parts = string.replaceAll("\n", "").split("\\s");
        int countWords = 0;
        for (int i = 0; i < parts.length; i++) {
            countWords++;
        }
        return countWords;
    }

    public static boolean foundWordPolindromeInString(String string) {
        String reverseString = null;
        String[] words = string.split("\\s");
        for (String word : words) {

            String[] wordCheck = word.split("");
            if (wordCheck.length > 1) {
                StringBuilder buffer = new StringBuilder(word);
                buffer.reverse();
                reverseString = buffer.toString();
                if (word.equalsIgnoreCase(reverseString) && !word.equals("")) {
                    return true;
                }
            }
        }
        return false;
    }
}
