package by.epam.module2.multy.array;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Укажите количеcтво строк в матрице:");
        int m = in.nextInt();

        System.out.println("Укажите количество столбцов в матрице:");
        int n = in.nextInt();
        int[][] array = new int[m][n];

        System.out.println("Ведите элементы матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[0][j] > array[m - 1][j] && j % 2 == 0)
                    System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
