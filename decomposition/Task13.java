package by.epam.module2.decomposition;
//Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары "близнецов" из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Введите число натуральное число больше 2: ");
        n = in.nextInt();
        while (n <= 2) {
            System.out.println("Введите число натуральное число больше 2: ");
            n = in.nextInt();
        }
        int[][] matrix = createMatrixOfTwin(n);
        for (int i = 0; i < matrix.length && matrix[i][0] != 0; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] createMatrixOfTwin(int n) {
        int[][] matrixOfTwin = new int[n - 1][2];
        int count = 0;
        for (int i = n; i <= 2 * n - 2; i++) {
            if (prime(i) && prime(i + 2)) {
                matrixOfTwin[count][0] = i;
                matrixOfTwin[count][1] = i + 2;
                count++;
            }
        }
        return matrixOfTwin;
    }

    private static boolean prime(int a) {
        boolean prime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
