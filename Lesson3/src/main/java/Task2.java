import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        //  2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
        // умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

        System.out.println(summ(15, 5));

    }

    static int summ(int a, int b) {
        int[] massivInt;
        int total;
        if (a < 0) {
            a = a * -1;
            massivInt = new int[a];
            Arrays.fill(massivInt, b);
            total = IntStream.of(massivInt).sum() * -1;

        } else {
            massivInt = new int[a];
            Arrays.fill(massivInt, b);
            total = IntStream.of(massivInt).sum();
        }
        return total;
    }
}
