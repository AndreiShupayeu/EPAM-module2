package by.epam.module2.array;
//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте длинну массива: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        int sum = 0;

        System.out.println("Укажите число которому должны быть кратные элементы: ");
        int K = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Укажите конкретные элементы массива:");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (array[i] % K == 0)
                sum += array[i];
        }
        System.out.println("сумма элементов кратных введенному числу: " + sum);
    }
}

//Перерешал задачу повторно после двух месяцев усердных занятий
class Task1Add {
    public static void main(String[] args) {

        System.out.println("Enter digit n for define length of array:");
        int n = getInt();

        int[] array = createArray(n);

        System.out.println("Enter digit for define multiple:");
        int k = getInt();

        int sum = sumElements(array, k);

        System.out.println("Sum of elements is: " + sum);
    }

    public static int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i+1;
        }
        return array;
    }

    public static boolean isMultiple(int a, int b) {
        return a % b == 0;
    }

    public static int sumElements(int[] array, int b) {
        int sum = 0;
        for (int a : array) {
            if (isMultiple(a, b))
                sum += a;
        }
        return sum;
    }

    public static int getInt() {
        int x;
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Enter digit!");
            in.nextLine();
        }
        x = in.nextInt();
        return x;
    }
}