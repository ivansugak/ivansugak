import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        //        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
        Integer[] massiv = {0, 3, 46, 3, 2, 1, 2};
        printMassiv(massiv);

    }

    static void printMassiv(Integer[] massive) {
        List<Integer> listNumbers = new ArrayList<>();
        List<Integer> mass = Arrays.asList(massive);
        int count = 0;
        for (int i = 0; i < mass.size(); i++) {
            count = Collections.frequency(mass, mass.get(i));
            if (count > 1) {
                listNumbers.add(mass.get(i));
            }
        }

        if (listNumbers.size() > 0) {
            System.out.print("Массив имеет повторяющиеся элементы ");
            HashSet finalList = new HashSet();
            finalList.addAll(listNumbers);
            System.out.println(finalList);

        } else {
            System.out.print("Массив не имеет повторяющихся элементов ");
        }
    }
}
