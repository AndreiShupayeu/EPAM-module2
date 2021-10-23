package by.epam.module2.multy.array;
//Найти положительные элементы главной диагонали квадратной матрицы.
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[][] array = {{-5, 2, 3},
                {4, 3, 6},
                {7, 8, 9}};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0 && i == j) {
                    count++;
                }
            }
        }

        int[] adArray = new int[count];
        int indexNumbersAdArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0 && i == j) {
                    adArray[indexNumbersAdArray] = array[i][j];
                    indexNumbersAdArray++;

                }
            }
        }
        System.out.println(Arrays.toString(adArray));
    }
}

