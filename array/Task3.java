package by.epam.module2.array;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве:");
        int n = scanner.nextInt();
        double[] array = new double[n];
        int countPositivs = 0;
        int countNegativs = 0;
        int countZero = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите числа массива:");
            array[i] = scanner.nextDouble();
        }
        for (double i : array) {
            if (i > 0)
                countPositivs++;
            if (i < 0)
                countNegativs++;
            if (i == 0)
                countZero++;
        }
        System.out.println("отрицательных: " + countNegativs + " положительных: " + countPositivs + " нулей :" + countZero);
    }
}
