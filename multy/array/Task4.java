package by.epam.module2.multy.array;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите четное число для создания матрицы:");
        int n = in.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = (j + 1);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = n - j;
                }
            }
        }

        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}