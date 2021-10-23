package by.epam.module2.decomposition;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер стороны a:");
        int side = in.nextInt();

        System.out.println("Площадь правильного шестиугольника: " + findSquareCorrectHexagon(side));
    }

    private static double findSquareEquilateralTriangle(int a) {
        return Math.sqrt(3) / 4 * a * a;
    }

    private static double findSquareCorrectHexagon(int a) {
        return 6 * findSquareEquilateralTriangle(a);
    }
}
