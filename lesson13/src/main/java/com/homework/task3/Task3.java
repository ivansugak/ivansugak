package com.homework.task3;

import com.homework.task3.formatter.Formatter;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("lesson13//textTask3.txt")) {

            Scanner scanner = new Scanner(fileReader);
            String[] partsText; //строки
            int count = 0;
            Set<String> ckeckString = new HashSet<>();
            ArrayList<String> chString = new ArrayList<>();
            ArrayList<String> failString = new ArrayList<>();


            while (scanner.hasNextLine()) {
                partsText = scanner.nextLine().split("[<?!.>]");
                String[] partsString; //слова
                for (int i = 0; i < partsText.length; i++) {
                    partsString = partsText[i].split("[\\s]");
                    for (String str : partsString) {
                        if (Formatter.isWordFromBlackList(str)) {
                            System.out.println("Text failed! " + partsText[i]);
                            count++;
                            failString.add(partsText[i]);
                        }
                        if (!Formatter.isWordFromBlackList(str)) {
                            chString.add(partsText[i]);
                        }
                    }
                }
            }
            for (int i = 0; i < chString.size(); i++) {
                for (int j = 0; j < failString.size(); j++) {
                    if (!chString.get(i).equals(failString.get(j))) {
                        ckeckString.add(chString.get(i));
                    }
                }
            }
            System.out.println("Text failed " + count + " time");
            System.out.println("Text checked: " + ckeckString);
        }
    }
}

