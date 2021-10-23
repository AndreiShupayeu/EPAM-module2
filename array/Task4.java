package by.epam.module2.array;
//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        int[] arrays = new int[n];

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Введите числа массива:");
            arrays[i] = scanner.nextInt();
        }
        int max = arrays[0];
        for (int x : arrays) {
            if (x > max)
                max = x;
        }
        int min = arrays[0];
        for (int x : arrays) {
            if (min > x)
                min = x;
        }
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == max) {
                arrays[i] = min;
                break;
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == min) {
                arrays[i] = max;
                break;
            }
        }
        System.out.println(max + " " + min);
        System.out.println(Arrays.toString(arrays));
    }
}
//Перерешал повторно спустя несколько месяцев.

class Test {
    public static void main(String[] args) {
        double[] digits = {-20, -9, 6, 7, 2.5, 150.3, -14.3, 22, 8};

        swap(digits, getMaxElement(digits), getMinElement(digits));

        System.out.println(Arrays.toString(digits));
    }

    public static double getMaxElement(double[] doubles) {
        double max = doubles[0];
        for (double d : doubles) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public static double getMinElement(double[] doubles) {
        double min = doubles[0];
        for (double d : doubles) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public static void swap(double[] doubles, double a, double b) {
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] == a) {
                doubles[i] = b;
            } else {
                if (doubles[i] == b) {
                    doubles[i] = a;
                }
            }
        }
    }
}