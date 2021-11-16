package com.homework.formatter;

public class TextFormatter {
    public static int countingWords(String string) {
        String[] parts = string.split("\\s");
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
            StringBuilder buffer = new StringBuilder(word);
            buffer.reverse();
            reverseString = buffer.toString();
            if (word.equals(reverseString) && !word.equals("")) {
                return true;
            }
        }
        return false;
    }
}
