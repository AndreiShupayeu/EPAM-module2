package by.epam.module2.decomposition;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial1(int value) {
        int factorial=1;
        for(int i=1;i<=value;i++){
            factorial *=i;
        }
        return factorial; // your implementation here
    }
    public static BigInteger factorial(int value) {
    int factorial= 1;
        for(int i=1;i<=value;i++){
            factorial *=i;
        }
        return BigInteger.valueOf(factorial); // your implementation here
    }
}
