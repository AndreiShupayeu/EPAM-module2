package by.epam.module2.sort.array;
//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
//на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов в массиве:");
        int[] array = new int[in.nextInt()];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Заданная последовательность: " + Arrays.toString(array));
        System.out.println("Последовательность после сортировки: " + Arrays.toString(shellSort(array)));
    }

    private static int[] shellSort(int[] a) {
        int d = a.length / 2;
        while (d > 0) {
            for (int i = 0; i < a.length - d; i++) {
                int j = i;
                while (j >= 0 && a[j] > a[j + d]) {
                    int temp = a[j];
                    a[j] = a[j + d];
                    a[j + d] = temp;
                    j--;
                }
            }
            d = d / 2;
        }
        return a;
    }
}