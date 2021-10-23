package by.epam.module2.multy.array;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в строке матрицы:");
        int m = in.nextInt();
        System.out.println("Введите количество чисел в столбце матрицы:");
        int n = in.nextInt();
        int[][] array = new int[m][n];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("Создана матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Введите номер строки которую нужно вывести на экран:");
        int k = in.nextInt();

        System.out.println("Необходимая строка:");

        for (int j = 0; j < n; j++) {
            System.out.print(array[k][j] + "\t");
        }

        System.out.println();

        System.out.println("Введите номер столбца который нужно вывести на экран:");
        int p = in.nextInt();

        System.out.println("Необходиый столбец:");
        for (int i = 0; i < m; i++) {
            System.out.println(array[i][p] + "\t");
        }
    }
}
