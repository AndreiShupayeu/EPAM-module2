package by.epam.module2.decomposition;

import java.util.Scanner;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Vvedite chislo: ");
        int a = in.nextInt();

        System.out.println(countActions(a));
    }

    private static int sumDigits(int x) {
        int sumDigits = 0;
        while (x > 0) {
            sumDigits += x % 10;
            x /= 10;
        }
        return sumDigits;
    }

    private static int findDiff(int x, int y) {
        return x - y;
    }

    private static int countActions(int x) {
        int count = 0;
        while (x != 0) {
            x = findDiff(x, sumDigits(x));
            count++;
        }
        return count;
    }
}
