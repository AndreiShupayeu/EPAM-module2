package by.epam.module2.multy.array;
//Сформировать квадратную матрицу порядка N по правилу:
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите дважды одинаковое число для размера матрицы:");
        int n = in.nextInt();
        double[][] array = new double[n][n];
        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] =Math.sin((i * i - j * j) /(double) n);
                if (array[i][j]>0){
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}