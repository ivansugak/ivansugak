public class Task7 {
    public static void main(String[] args) {
        //7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ((int) (Math.random() * 20));
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0) {
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");
        }
    }
}
