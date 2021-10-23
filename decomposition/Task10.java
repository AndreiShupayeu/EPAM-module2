package by.epam.module2.decomposition;

//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите натуральное число для формирования из его цифр массива:");
        int N = in.nextInt();

        int[] array = createArrayDigits(N, countDigits(N));
        System.out.println(Arrays.toString(array));

    }

    private static int countDigits(int N) {
        int count = 1;
        while (N > 9) {
            count++;
            N = N / 10;
        }
        return count;
    }

    private static int[] createArrayDigits(int N, int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = N % 10;
            N  /= 10;
        }
        return array;
    }
}