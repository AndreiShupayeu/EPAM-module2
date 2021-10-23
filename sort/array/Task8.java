package by.epam.module2.sort.array;
//Даны дроби. Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество дробей в последовательности:");
        int n = in.nextInt();
        int[] arrayNumerator = new int[n];
        int[] arrayDenominator = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите числитель для каждой дроби:");
            arrayNumerator[i] = in.nextInt();

            System.out.println("Введите знаменатель для каждой дроби:");
            arrayDenominator[i] = in.nextInt();
        }
        System.out.println("Последовательность дробей: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrayNumerator[i] + "/" + arrayDenominator[i]);
        }

        int totalDenominator = arrayDenominator[0];
        for (int i = 1; i < n; i++) {
            totalDenominator = totalDenominator * arrayDenominator[i];
        }

        int[] newArrayNumerator = new int[n];
        for (int i = 0; i < n; i++) {
            newArrayNumerator[i] = arrayNumerator[i] * totalDenominator / arrayDenominator[i];
        }

        System.out.println();
        System.out.println("Последовательность с общим знаменателем: ");
        for (int i = 0; i < n; i++) {
            System.out.println(newArrayNumerator[i] + "/" + totalDenominator);
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (newArrayNumerator[j - 1] > newArrayNumerator[j]) {
                    int temp = newArrayNumerator[j];
                    newArrayNumerator[j] = newArrayNumerator[j - 1];
                    newArrayNumerator[j - 1] = temp;
                }
            }
        }
        System.out.println("Отсортированная последовательность:");
        for (int i = 0; i < n; i++) {
            System.out.println(newArrayNumerator[i] + "/" + totalDenominator);
        }
    }
}