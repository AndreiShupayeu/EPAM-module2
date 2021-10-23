package by.epam.module2.multy.array;
//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк в матрице:");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов в матрице:");
        int m = in.nextInt();
        int[][] array = new int[n][m];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("Введите номера столбцов, которые необходимо поменять местами:");
        int k = in.nextInt()-1;
        int s = in.nextInt()-1;

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int temp = array[i][k];
            array[i][k] = array[i][s];
            array[i][s] = temp;
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
