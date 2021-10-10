import static java.lang.Math.pow;

public class Task1 {
    public static void main(String[] args) {
        //Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

        int count = 24 / 3;

        System.out.println(pow(2.0, count - 1));

    }
}
