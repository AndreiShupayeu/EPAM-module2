package by.epam.module2.multy.array;
//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк в матрице:");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов в матрице:");
        int m = in.nextInt();
        int[][] array = new int[n][m];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[] addArray = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                addArray[j] += array[i][j];
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(addArray));

        int maxSum = Integer.MIN_VALUE;
        for (int x : addArray) {
            if (x > maxSum) {
                maxSum = x;
            }
        }

        System.out.println();
        System.out.println("Максимальная сумма элементов:" + maxSum);
        int index = 0;
        for (int i = 0; i < m; i++) {
            if (addArray[i] == maxSum) {
                index = i + 1;
                break;
            }
        }
        System.out.println();
        System.out.println("Номер столбца с максимальной суммой:" + index);
    }
}
