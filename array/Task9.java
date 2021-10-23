package by.epam.module2.array;
//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество цифр в массиве:");
        int[] array = new int[in.nextInt()];

        System.out.println("Введите числа массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int[] popularNum = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popularNum[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(popularNum));
        int popularNumber = popularNum[0];
        int minPopularNumber = array[0];
        for (int i = 0; i < popularNum.length; i++) {
            if (popularNumber < popularNum[i]) {
                popularNumber = popularNum[i];
                minPopularNumber = array[i];
            }
            if (popularNumber == popularNum[i] && minPopularNumber > array[i])
                minPopularNumber = array[i];
        }
        System.out.println(minPopularNumber);
    }
}
