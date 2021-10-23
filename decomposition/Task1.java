package by.epam.module2.decomposition;
//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа для которых надо найти НОД и НОК:");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("НОД: " + findMaxTotalDivider(a, b));
        System.out.println("НОК: " + findMinTotalMultiple(a, b, findMaxTotalDivider(a, b)));
    }

    private static int findMinTotalMultiple(int a, int b, int maxTotalDivider) {
        return a * b / maxTotalDivider;
    }

    private static int findMaxTotalDivider(int a, int b) {
        int maxTotalDivider = 1;

        int min = a < b ? a : b;
        System.out.println(min + " min");

        for (int i = 2; i < min; i++) {
            System.out.println(i);
            while (a % i == 0 && b % i == 0) {
                maxTotalDivider = maxTotalDivider * i;
                System.out.println(i + " after while");
                if (a % i == 0) {
                    a = a / i;
                }
                if (b % i == 0) {
                    b = b / i;
                }
            }
        }

        return maxTotalDivider;
    }
}