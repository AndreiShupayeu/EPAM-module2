package by.epam.module2.array;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        double[] array = new double[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите вещественные числа последовательности:");
            array[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(array));
        double sumDoubles = 0;
        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < array.length; j++) {
                if (i % j == 0 && i != j)
                    break;
                if (i % j == 0)
                    sumDoubles += array[i];
            }
        }
        System.out.println("Сумма вещ.чисел у которых пор.номера простые числа:" + sumDoubles);
    }
}
