package by.epam.module2.array;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите числа:");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i < array[i])
                System.out.println(array[i]);
        }
    }
}
