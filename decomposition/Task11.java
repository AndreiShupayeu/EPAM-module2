package by.epam.module2.decomposition;
//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();

        System.out.println("Цифр в первом числе: " + countDigits(a));
        System.out.println("Цифр во втором числе: " + countDigits(b));
        System.out.println();

        if (countDigits(a) > countDigits(b)) {
            System.out.println("В первом числе цифр больше!");
        } else {
            System.out.println("Во втором числе цифр больше!");
        }
    }

    private static int countDigits(int n) {
        int count = 1;
        while (n > 9) {
            count++;
            n /= 10;
        }
        return count;
    }
}
