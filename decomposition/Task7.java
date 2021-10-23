package by.epam.module2.decomposition;
//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Сумма факториалов нечетных чисел до 9: " + sumOddFactorials(9));
    }

    private static int factorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static int sumOddFactorials(int n) {
        int sumOddFactorials = 0;
        for (int i = 1; i <= n; i += 2) {
            sumOddFactorials += factorial(i);
        }
        return sumOddFactorials;
    }
}