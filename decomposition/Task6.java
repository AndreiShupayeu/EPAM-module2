package by.epam.module2.decomposition;
//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите три числа для проверки на взамную простоту:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (coprime(a, b, c)) {
            System.out.println("Числа являются взаимно простыми");
        } else {
            System.out.println("Числа не являются взаимно простыми");
        }
    }

    private static boolean coprime(int a, int b, int c) {
        int min = Math.min(Math.min(a, c), b);
        boolean coprime = true;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                coprime = false;
                break;
            }
        }
        return coprime;
    }
}
