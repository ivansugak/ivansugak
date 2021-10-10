import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
        print();

    }

    static void print() {
        Scanner printNumber = new Scanner(System.in);
        String[] numMass;

        while (true) {

            String string = printNumber.nextLine();
            char[] strToArray = string.toCharArray();
            int count = 0;
            for (int i = 0; i < strToArray.length; i++) {
                System.out.print(strToArray[i]);
                count++;
            }
            if (strToArray[0] == '-') {
                System.out.print(" - это отрицательное число, количество цифр = " + (count - 1));
            } else if (strToArray[0] == '0') {
                System.out.print(" - это ноль, количество цифр = " + count);
            } else {
                System.out.print(" - это положительное число, количество цифр = " + count);
            }
        }
    }
}
