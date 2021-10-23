package by.epam.module2.decomposition;
//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Vvedite chislo n:");
        int n = in.nextInt();

        for (int i = findMinForNumberExponent(n); i <= findMaxForNumberExponent(n); i++) {
            if (increasingSequence(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean increasingSequence(int x) {
        boolean increasingSequence = true;
        int a;
        int b;
        while (x > 10) {
            a = x % 10;
            b = a;
            x /= 10;
            a = x % 10;
            if (b != a + 1) {
                increasingSequence = false;
            }
        }
        return increasingSequence;
    }

    private static int findMinForNumberExponent(int n) {
        int minForNumberExponent = 0;
        for (int i = 1, j = n - 1; i <= n; i++, j--) {
            minForNumberExponent += i * Math.pow(10, j);
        }
        return minForNumberExponent;
    }

    private static int findMaxForNumberExponent(int n) {
        int maxForNumberExponent = 0;
        for (int i = 10 - n, j = n - 1; i <= 9; i++, j--) {
            maxForNumberExponent += i * Math.pow(10, j);
        }
        return maxForNumberExponent;
    }
}