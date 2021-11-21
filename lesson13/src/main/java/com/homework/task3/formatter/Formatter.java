package com.homework.task3.formatter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Formatter {

    public static boolean isWordFromBlackList(String string) throws IOException {
        try (FileReader fileReader = new FileReader("lesson13//blackList.txt")) {

            Scanner scanner = new Scanner(fileReader);
            String[] partsBlackList;

            while (scanner.hasNextLine()) {
                partsBlackList = scanner.nextLine().split("\\n");
                for (String str : partsBlackList) {
                    if (str.equals(string)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
