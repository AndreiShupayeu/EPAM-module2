package by.epam.module2.decomposition;
//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Укажите количество точек:");
        int n = in.nextInt();
        int[][] matrix = new int[n][2];

        System.out.println("Введите координаты:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int[][] diffMatrix = new int[matrix.length][];

        for (int i = 0; i < matrix.length; ++i) {

            int x1 = matrix[i][0];
            int y1 = matrix[i][1];

            int[] diffs = new int[matrix.length];

            for (int j = i + 1; j < matrix.length; ++j) {
                int x2 = matrix[j][0];
                int y2 = matrix[j][1];

                diffs[j] = (int) findDistance(x1, y1, x2, y2);
            }

            diffMatrix[i] = diffs;
        }

        System.out.println("Самое большое расстояние: " + findMaxDistance(diffMatrix));
        System.out.println();
        System.out.println("Координаты точек между которыми самое большое расстояние: "
                + Arrays.deepToString(createArrayOfPoints(diffMatrix, matrix)));
    }

    private static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private static double findMaxDistance(int[][] a) {
        double maxDistance = Double.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] > maxDistance) {
                    maxDistance = a[i][j];

                }
            }
        }
        return maxDistance;
    }

    private static int[][] createArrayOfPoints(int[][] a, int[][] b) {
        int[][] arrayOfPoints = new int[countMaxDistance(a)][4];
        int countMaxDistance = 0;
        double maxDistance = findMaxDistance(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == maxDistance) {
                    int x1 = b[i][0];
                    int y1 = b[i][1];
                    int x2 = b[j][0];
                    int y2 = b[j][1];
                    arrayOfPoints[countMaxDistance][0] = x1;
                    arrayOfPoints[countMaxDistance][1] = y1;
                    arrayOfPoints[countMaxDistance][2] = x2;
                    arrayOfPoints[countMaxDistance][3] = y2;
                    countMaxDistance++;
                }
            }
        }
        return arrayOfPoints;
    }

    private static int countMaxDistance(int[][] a) {
        int countMaxDistance = 0;
        double maxDistance = findMaxDistance(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == maxDistance) {
                    countMaxDistance++;

                }
            }
        }
        return countMaxDistance;
    }
}