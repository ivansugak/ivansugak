import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
        printMass();


    }

    static void printMass() {
        Scanner button = new Scanner(System.in);
        String s = button.nextLine();


        switch (s) {
            case "a": {
                String[][] mass = {{" ", " ", " ", "*"},
                        {" ", " ", "*", "*"},
                        {" ", "*", "*", "*"},
                        {"*", "*", "*", "*"}};
                for (String[] print : mass) {
                    System.out.println(Arrays.toString(print));
                }
                break;
            }
            case "b": {
                String[][] mass = {{"*", " ", " ", " "},
                        {"*", "*", " ", " "},
                        {"*", "*", "*", " "},
                        {"*", "*", "*", "*"}};
                for (String[] print : mass) {
                    System.out.println(Arrays.toString(print));
                }
                break;
            }
            case "d": {
                String[][] mass = {{"*", "*", "*", "*"},
                        {"*", "*", "*", " "},
                        {"*", "*", " ", " "},
                        {"*", " ", " ", " "}};
                for (String[] print : mass) {
                    System.out.println(Arrays.toString(print));
                }
                break;
            }
            case "c": {
                String[][] mass = {{"*", "*", "*", "*"},
                        {" ", "*", "*", "*"},
                        {" ", " ", "*", "*"},
                        {" ", " ", " ", "*"}};
                for (String[] print : mass) {
                    System.out.println(Arrays.toString(print));
                }
                break;
            }
            default: {
                System.out.println("you made the wrong choice");
            }
        }
    }
}
