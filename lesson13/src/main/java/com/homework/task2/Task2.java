package com.homework.task2;

import com.homework.task2.formatter.TextFormatter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    //         * 2)Текстовый файл hw2/input.txt содержит текст.
//     * После запуска программы в другой файл должны записаться только те предложения, в которых от 3-х до 5-ти слов.
//                * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в output.txt файл.
//     * Пишем все в ООП стиле. Создаем класс TextFormatter
//                * в котором два статических метода:
//     * 1. Метод принимает строку и возвращает кол-во слов в строке.
//                * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//                * В main считываем файл.
//                * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//                * Если подходит добавляем его в output.txt файл
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("lesson13//inputTask2.txt");
             FileWriter fileWriter = new FileWriter("lesson13//outputTask2.txt")) {

            Scanner scanner = new Scanner(fileReader);
            String[] parts;
            while (scanner.hasNextLine()) {
                parts = scanner.nextLine().split("[!.?\\n]");
                for (String part : parts) {
                    if (TextFormatter.countingWords(part) >= 3 && TextFormatter.countingWords(part) <= 5 ||
                            TextFormatter.foundWordPolindromeInString(part)) {
                        fileWriter.write(part + "\n");
                    }
                }
            }
        }
    }
}
