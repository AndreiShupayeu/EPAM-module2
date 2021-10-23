package by.epam.module2.array;
//Дана последовательность целых чисел a1,a2,...,an . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1,a2,...,an) .
import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите количество чисел:");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число последовательности:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Задана последовательность чисел: " + Arrays.toString(array));

        int min = array[0];
        for (int j : array) {
            if (min > j)
                min = j;
        }
        System.out.println("Минимальное значение введенной последовательности: " + min);

        int countWithoutMin = 0;
        for (int j : array) {
            if (j != min) {
                countWithoutMin++;
            }
        }
        int[] withoutMin = new int[countWithoutMin];

        int indexForNewArray = 0;
        for (int j : array) {
            if (j != min) {
                withoutMin[indexForNewArray] = j;
                indexForNewArray++;
            }

        }

        System.out.println(Arrays.toString(withoutMin));
    }
}




