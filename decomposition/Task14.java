package by.epam.module2.decomposition;
//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число k: ");
        int k = in.nextInt();

        System.out.println(Arrays.toString(createArrayNumbersArmstrong(k)));
    }

    private static int countDigits(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    private static int sumDigitsInRow(int x) {
        int y = countDigits(x);
        int a = 0;
        while (x > 0) {
            a += Math.pow(x % 10, y);
            x /= 10;
        }
        return a;
    }

    private static int countNumbersArmstrong(int k) {
        int count = 0;
        for (int i = 1; i < k; i++) {
            if (i == sumDigitsInRow(i)) {
                count++;
            }
        }
        return count;
    }

    private static int[] createArrayNumbersArmstrong(int k) {
        int[] arrayNumbersArmstrong = new int[countNumbersArmstrong(k)];
        int index = 0;
        for (int i = 1; i < k; i++) {
            if (i == sumDigitsInRow(i)) {
                arrayNumbersArmstrong[index] = i;
                index++;
            }
        }
        return arrayNumbersArmstrong;
    }
}



