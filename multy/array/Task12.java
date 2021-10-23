package by.epam.module2.multy.array;
//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                {7, 9, 8, 7},
                {6, 5, 3, 2}};

        rowsIncrease(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        rowDiscrease(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] rowsIncrease(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int n = 0; n < x[i].length; n++) {
                for (int j = x[i].length - 1; j > n; j--) {
                    if (x[i][j] > x[i][j - 1]) {
                        int temp = x[i][j];
                        x[i][j] = x[i][j - 1];
                        x[i][j - 1] = temp;
                    }
                }
            }
        }
        System.out.println();
        return x;
    }

    private static int[][] rowDiscrease(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int n = 0; n < x[i].length; n++) {
                for (int j = x[i].length - 1; j > n; j--) {
                    if (x[i][j] < x[i][j - 1]) {
                        int temp = x[i][j];
                        x[i][j] = x[i][j - 1];
                        x[i][j - 1] = temp;
                    }
                }
            }
        }
        System.out.println();
        return x;
    }
}

