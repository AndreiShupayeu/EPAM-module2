package by.epam.module2.sort.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Даны две последовательности n m a  a  a и b  b  b 1 2 1 2 . Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов первой последовательности:");
        int n = in.nextInt();
        System.out.println("Введите количество элементов второй последовательности:");
        int m = in.nextInt();
        int[] arrayN = new int[n];
        int[] arrayM = new int[m];

        Random r = new Random();
        for (int i = 0; i < n ; i++) {
            arrayN[i] = r.nextInt(100);
        }
        for (int i = 0; i < m ; i++) {
            arrayM[i] = r.nextInt(100);
        }
        Arrays.sort(arrayM);
        Arrays.sort(arrayN);
        System.out.println(Arrays.toString(arrayN) + "\n" + Arrays.toString(arrayM));
        System.out.println();
        arrayM = sortTotalArray(arrayM, arrayN);
        System.out.println(Arrays.toString(arrayM));
    }

    private static int[] sortTotalArray(int[] x, int[] y) {
        int[] a = new int[x.length + y.length];
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < x.length && j < y.length) {
            if (x[i] < y[j]) {
                a[count++] = x[i++];
            } else {
                a[count++] = y[j++];
            }
        }
        while (i < x.length) {
            a[count++] = x[i++];
        }
        while (j < y.length) {
            a[count++] = y[j++];
        }
        return a;
    }
}

