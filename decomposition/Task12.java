package by.epam.module2.decomposition;
//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число k:" + "\n");
        int k = in.nextInt();
        System.out.println("Введите число n:" + "\n");
        int n = in.nextInt();

        System.out.println(Arrays.toString(createArrayElements(k,n)));
    }

    private static int sumDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }

    private static int countArrayElements(int k, int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (sumDigits(i) == k) {
                count++;
            }
        }
        return count;
    }

    private static int[] createArrayElements(int k, int n) {

        int[] arrayElements = new int[countArrayElements(k, n)];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (sumDigits(i) == k) {
                arrayElements[count] = i;
                count++;
            }
        }
        return arrayElements;
    }
}


