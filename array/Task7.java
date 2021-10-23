package by.epam.module2.array;
//Даны действительные числа a1,a2,...,an . Найти
//max( a1 + a2n,a2 + a2n−1,...,an + an+1)
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число n для последовательности чисел:");
        int n = scanner.nextInt();
        int[] array = new int[n * 2];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите числа последовательности:");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int[] sumPairs = new int[n];
        for (int i = 1, j = 2 * n; i <= n; i++, j--) {
            sumPairs[i - 1] = array[i - 1] + array[j - 1];
        }
        System.out.println("Значения сумм пар: " + Arrays.toString(sumPairs));

        int max = 0;
        for (int i = 0; i < sumPairs.length; i++) {
            if (sumPairs[i] > max)
                max = sumPairs[i];
        }
        System.out.println("Максимальное значение: " + max);
    }
}
