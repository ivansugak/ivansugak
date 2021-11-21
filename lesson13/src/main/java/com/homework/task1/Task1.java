package com.homework.task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("lesson13//input.txt");
             FileWriter fileWriter = new FileWriter("lesson13//output.txt")) {

            Scanner scanner = new Scanner(fileReader);
            String str;
            while (scanner.hasNext()) {
                str = scanner.next().replaceAll("[<0-9?!.,\\s>]+", "");
                if (Task1.foundWordPolindrome(str) && !str.equals("")) {
                    fileWriter.write(str + "\n");
                }
            }
        }
    }

    public static boolean foundWordPolindrome(String string) {
        StringBuilder buffer = new StringBuilder(string);
        buffer.reverse();
        String reverseString = buffer.toString();
        return string.equalsIgnoreCase(reverseString);
    }
}

