package by.epam.module2.decomposition;

//Даны числа X, Y, Z, Т - длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y - прямой.

public class Task9 {
    public static void main(String[] args) {
        System.out.println(findSquareQuadrilateralWithStraightAngle(20, 30, 60, 80));

    }

    private static double findSquareQuadrilateralWithStraightAngle(int x, int y, int z, int t) {
        return findTriangleSquareWithStraightAngle(x, y) + findSquareTriangle(z, t, findHypotenuse(x, y));
    }

    private static double findTriangleSquareWithStraightAngle(int x, int y) {
        return x * y / 2.0;
    }

    private static double findHypotenuse(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    private static double findSquareTriangle(int x, int y, double a) {
        double squareTriangle;
        double halfMeterTriangle = (x + y + a) / 2;
        squareTriangle = Math.sqrt(
                halfMeterTriangle
                        * (halfMeterTriangle - x)
                        * (halfMeterTriangle - y)
                        * (halfMeterTriangle - a));
        return squareTriangle;
    }
}
