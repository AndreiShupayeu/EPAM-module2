package by.epam.module2.sort.array;
//Сортировка выбором. Дана последовательность чисел a1 < a2 ...< an .Требуется переставить элементы так, чтобы они
//были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится
//на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
//Написать алгоритм сортировки выбором.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        array = descendingRow(array);
        System.out.println(Arrays.toString(array));

    }

    private static int[] descendingRow(int[] x) {
        for (int i = 0; i < x.length; i++) {
            int max = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] > x[max]) {
                    max = j;
                }
            }
            int temp = x[i];
            x[i] = x[max];
            x[max] = temp;
        }
        return x;
    }
}



