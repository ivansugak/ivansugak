import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        //6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
        int[] mass = new int[12];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ((int) (Math.random() * 15));
//            System.out.print(mass[i] +" "); //for watching
        }

        int[] maxNumber = Arrays.copyOf(mass, mass.length);

        Arrays.sort(maxNumber);

        int number = 0;

        for (int j = 0; j < mass.length; j++) {
            if (mass[j] == maxNumber[11]) {
                number = j;
            }
        }
        System.out.println("индекс последнего вхождения в массив максимального значения массива " + number);
    }
}
