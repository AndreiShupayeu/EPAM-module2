package by.epam.module2.multy.array;
//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.Arrays;
public class Task15 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 5},
                {-1, 7, -2, 9},
                {1, -2, -8, 7}
        };

        System.out.println(maxElement(array));
        int a = maxElement(array);
        System.out.println(Arrays.deepToString(changOddElement(array, a)));
    }

    private static int maxElement(int[][] x) {
        int max = x[0][0];
        for (int[] y : x) {
            for (int i : y) {
                if (max < i) {
                    max = i;
                }
            }
        }
        return max;
    }

    private static int[][] changOddElement(int[][] x, int max) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] < 0) {
                    x[i][j] = max;
                }
            }
        }
        return x;
    }
}

