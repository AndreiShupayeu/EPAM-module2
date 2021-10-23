package by.epam.module2.decomposition;

import java.util.Scanner;
// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четыре числа для нахождения НОД:");
        System.out.println(findMaxTotalDivider(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
    }

    private static int findMaxTotalDivider(int a, int b, int c, int d) {
        int maxTotalDivider = 1;
        int min = Math.min(Math.min(a, b), Math.min(c, d));
        for (int i = 2; i < min; i++) {
            while (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                maxTotalDivider = maxTotalDivider*i;
                if (a % i == 0) {
                    a = a / i;
                }
                if (b % i == 0) {
                    b = b / i;
                }
                if (c % i == 0) {
                    c = c / i;
                }
                if (d % i == 0) {
                    d = d / i;
                }
            }
        }

        return maxTotalDivider;
    }

}
