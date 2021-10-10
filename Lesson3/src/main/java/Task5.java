import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        //5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
        Task5 task5 = new Task5();
        Integer[] a = new Integer[100];

        task5.printMassiv(a);

    }

    private void printMassiv(Integer[] a) {
        for (int i = 0; i < 100; i++) {
            a[i] = i;
            System.out.print(a[i] + " ");
        }

        List<Integer> list = Arrays.asList(a);

        Collections.reverse(list);

        System.out.println();

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
