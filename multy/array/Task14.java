package by.epam.module2.multy.array;
//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int m = in.nextInt();
        int n = m;
        int[][] array = new int[m][n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            while (count <= i) {
                int j = (int) (Math.random() * m);
                if (array[j][i] != 1) {
                    array[j][i] = 1;
                    count++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
