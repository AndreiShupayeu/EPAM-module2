package by.epam.module2.array;
//Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;

        System.out.println("Введите число, на которое необходимо заменить числа последовательности:");
        int Z = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Укажите числа последовательности:");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Z) {
                array[i] = Z;
                count++;
            }
        }
        System.out.println("Количество замен: " + count);
        printNumbers(array);
    }
    private static void printNumbers(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
}
