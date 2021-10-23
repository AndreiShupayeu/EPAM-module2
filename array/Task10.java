package by.epam.module2.array;
//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве:");
        int a = scanner.nextInt();
        int[] array = new int[a];

        System.out.println("Введите числа массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int b = givesLength(a);

        for (int i = 1; i < b; i++) {
            array[i] = array[i * 2];

        }
        System.out.println(Arrays.toString(array));
        for (int i = b; i< array.length;i++){
            array [i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int givesLength(int x) {
        int a;
        if (x % 2 != 0) {
            a = x / 2 + 1;
        } else a = x / 2;
        return a;
    }
}

