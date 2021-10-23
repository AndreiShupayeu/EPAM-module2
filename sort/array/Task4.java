package by.epam.module2.sort.array;
//Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и a i+1. Если ai > ai+1, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Заданная последовательность: " + Arrays.toString(array));
        System.out.println("Количество замен: " + ascendingRow(array));
        System.out.println("Новая последовательность: " + Arrays.toString(array));
    }

    private static int ascendingRow(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    int temp2 = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp2;
                    count++;
                }
            }
        }
        return count;
    }
}
