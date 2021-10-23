package by.epam.module2.sort.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов первого массива:");
        int a = in.nextInt();
        System.out.println("Введите количество элементов второго массива, отличное от кол-ва элементов первого:");
        int b = in.nextInt();
        while (b == a) {
            System.out.println("Введите количество элементов второго массива, отличное от кол-ва элементов первого:");
            b = in.nextInt();
        }
        System.out.println("Введите натуральное число k, k должно меньше чем первый массив, минимум на два:");
        int k = in.nextInt();
        while (k > a - 2) {
            System.out.println("Введите натуральное число k, k должно меньше чем первый массив, минимум на два:");
            k = in.nextInt();
        }

        int[] arrayDest = new int[a];
        int[] arraySours = new int[b];

        Random r = new Random();

        for (int i = 0; i < arraySours.length; i++) {
            arraySours[i] = r.nextInt(a*2);
        }
        for (int i = 0; i < arrayDest.length; i++) {
            arrayDest[i] = r.nextInt(2*b);
        }
        System.out.println(Arrays.toString(arraySours) + "\n" + Arrays.toString(arrayDest));

        arrayDest = Arrays.copyOf(arrayDest, arrayDest.length + arraySours.length);

        System.arraycopy(arrayDest, k, arrayDest, k + arraySours.length, arrayDest.length - arraySours.length -k);

        System.arraycopy(arraySours, 0, arrayDest, k, arraySours.length);
        System.out.println(Arrays.toString(arrayDest));

    }
    // для решения задачи без встроенных методов могут быть использованы следующии функции:
    private static int[] arrayPlusArray(int[] x, int[] y, int k) {
        int[] a = new int[x.length + y.length];
        for (int i = 0; i < k; i++) {
            a[i] = x[i];
        }
        for (int i = k, j = 0; j < y.length; i++, j++) {
            a[i] = y[j];
        }
        for (int i = k + y.length, j = k; j < x.length; i++, j++) {
            a[i] = x[j];
        }
        return a;
    }
    	public static int[] createArray(int[] a, int[] b, int k) {
		int[] array = new int[a.length + b.length];

		int indexA = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = a[indexA++];
			if (indexA == k) {
				for (int j = 0; j < b.length; j++) {
					array[++i] = b[j];
				}
			}
		}
		return array;
	}
}
