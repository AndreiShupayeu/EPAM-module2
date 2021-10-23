package by.epam.module2.multy.array;
//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {
    public static void main(String[] args) {
        int[][] array = {{9, 2, 4},
                {4, 1, 6},
                {7, 8, 5}
        };

        increaseElemensColumn(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        discreaseElemensColumn(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] increaseElemensColumn(int[][] x) {
        for (int i = 0; i < x[0].length; i++) {
            for (int j = 0; j < x.length; j++) {
                for (int n = x.length - 1; n > j; n--) {
                    if (x[n - 1][i] < x[n][i]) {
                        int temp = x[n][i];
                        x[n][i] = x[n - 1][i];
                        x[n - 1][i] = temp;
                    }
                }
            }
        }
        return x;
    }

    private static int[][] discreaseElemensColumn(int[][] x) {
        for (int i = 0; i < x[0].length; i++) {
            for (int j = 0; j < x.length; j++) {
                for (int n = x.length - 1; n > j; n--) {
                    if (x[n - 1][i] > x[n][i]) {
                        int temp = x[n][i];
                        x[n][i] = x[n - 1][i];
                        x[n - 1][i] = temp;
                    }
                }
            }
        }
        return x;
    }
}
