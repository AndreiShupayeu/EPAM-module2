package by.epam.module2.decomposition;
//Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

public class Task8 {
    public static void main(String[] args) {
        int[] D = {0, 1, 2, 3, 4, 5, 6};

        System.out.println("Сумма элементов с 1-го по 3-й массива: " + findSumElements(D, 1, 3));
        System.out.println();
        System.out.println("Сумма элементов с 3-го по 5-й массива: " + findSumElements(D, 3, 5));
        System.out.println();
        System.out.println("Сумма элементов с 4-го по 6-й массива: " + findSumElements(D, 4, 6));

    }

    private static int findSumElements(int[] D, int k, int m) {
        int sumElements = 0;
        for (int i = k; i <= m; i++) {
            sumElements += D[i];
        }
        return sumElements;
    }
}
