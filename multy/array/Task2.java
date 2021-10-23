package by.epam.module2.multy.array;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел для строк и стоблцов матрицы:");
        int[][] array = new int[in.nextInt()][in.nextInt()];

        System.out.println("Введите числа матрицы:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
