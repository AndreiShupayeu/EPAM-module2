package by.epam.module2.decomposition;
//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Vvedite chislo n:");
        int n = in.nextInt();

        int sum = 0;
        for (int i = findMinNumberForExponent(n); i <= findMaxNumberForExponent(n); i++) {
            if (isOddDigits(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Summa: " + sum);
        System.out.println("Kolichestvo chetnih tsifr v summe: " + findAmountEvenNumbers(sum));
    }

    private static boolean isOddDigits(int x) {
        boolean oddDigits = true;
        while (x >= 1) {
            int a = x % 10;
            if (a % 2 == 0) {
                oddDigits = false;
                break;
            }
            x /= 10;
        }
        return oddDigits;
    }

    private static int findMinNumberForExponent(int n) {
        return (int) Math.pow(10, n - 1);
    }

    private static int findMaxNumberForExponent(int n) {
        return (int) Math.pow(10, n) - 1;
    }

    private static int findAmountEvenNumbers(int x) {
        int a;
        int amount = 0;
        while (x >= 1) {
            a = x % 10;
            if (a % 2 == 0) {
                amount++;
            }
            x /= 10;
        }
        return amount;
    }
}
