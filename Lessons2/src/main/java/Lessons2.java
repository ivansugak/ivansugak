public class Lessons2 {

    public static int sum(int a, int b) {
        int result = a + b;
        if (result > 2147483647) {
            return result = -1;
        } else if (result < -2147483648){
            return result = -1;
        } else {
            return result;
        }
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double average(int[] array) {
        double count = 0;
        double result = 0;
        int masLength = array.length;
        for (int value : array) {
            count = count + value;
        }
        return result = count / masLength;
    }

    public static int max(int[] array) {
        int result = 0;
        for (int value : array) {
            if (result < value) {
                result = value;
            }
        }
        return result;
    }

    public static double calculateHypotenuse(int a, int b) {
        double result = 0;
        result = (a * a + b * b);
        return Math.sqrt(result);
    }


    public static void main(String[] args) {

        System.out.println(sum(100, 200)); //#1 works
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));//#1 don't works
        System.out.println(max(56, 349));//#2 works

        int[] array = {10,2,3,4,5}; //#3 works
        System.out.println(average(array));

        int[] mas = {10,2,301,4,5}; //#4 works
        System.out.println(max(mas));

        System.out.println(calculateHypotenuse(12, 16));//#5 works

  }
}
