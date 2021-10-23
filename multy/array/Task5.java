package by.epam.module2.multy.array;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите четное число - размер матрицы:");
        int n = in.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = i + 1;
                if (i + j > n-1) {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
