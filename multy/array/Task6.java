package by.epam.module2.multy.array;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите дважды одно четное число для размера матрицы:");
        int n = in.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (i <= j || i + j >= n - 1) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = n / 2; j < n; j++) {
                if (i >= j || i + j <= n - 1) {
                    array[i][j] = 1;
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
