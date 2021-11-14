package com.homework.model;

public class Model {

    public char[] cutString(String string) {
        int start = string.indexOf("А");
        int end = string.lastIndexOf("В");
        char[] newString = new char[end - start];
        string.getChars(start, end, newString, 0);

        return newString;
    }

    public String replaceString(String string) {
        char first = string.charAt(3);
        char second = string.charAt(0);
        String stringForReturn = null;
        for (int i = 0; i < string.length(); i++) {
            stringForReturn = string.replace(first, second);
        }
        return stringForReturn;
    }

    public void foundWordPolindrome(String string) {
        StringBuilder buffer = new StringBuilder(string);
        buffer.reverse();
        String reverseString = buffer.toString();
        if (string.equals(reverseString)) {
            System.out.println(string + " is palindrome");
        } else {
            System.out.println(string + " is not palindrome");
        }
    }
}
