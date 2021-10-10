import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        //8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};

        int[] maxNumber = Arrays.copyOf(mass, mass.length);
        Arrays.sort(maxNumber);

        int temp = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == maxNumber[maxNumber.length - 1]) {
                temp = mass[i];
                mass[i] = mass[0];
                mass[0] = temp;
            }
        }
        for (int massive : mass) {
            System.out.print(massive + " ");
        }
    }
}
