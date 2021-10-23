package by.epam.module2.decomposition;
//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число элементов в массиве:");
        int N = in.nextInt();
        int[] A = new int[N];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(A) + "\n");
        System.out.println("В заданном массиве на втором месте по величине: " + findNumberOnSecondPlaceMax(A));

    }

    private static int findNumberOnSecondPlaceMax(int[] A) {

        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }

        int numberOnSecondPlaceMax = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (numberOnSecondPlaceMax < A[i] && A[i] != max) {
                numberOnSecondPlaceMax = A[i];
            }
        }
        return numberOnSecondPlaceMax;
    }
}
