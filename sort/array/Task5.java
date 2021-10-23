package by.epam.module2.sort.array;
/*Сортировка вставками. Дана последовательность чисел a1,...,an. Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1,...,ai - упорядоченная последовательность, т. е.
a1 <= a2 <= ... <= ai. Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.*/

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9};

        array = insertSort(array);
        System.out.println(Arrays.toString(array));


    }

    private static int[] insertSort( int[] a ) {

        int[] r = new int[a.length];
        r[0] = a[0];
        for ( int len = 1; len < a.length; len ++ ) {
            int i = binarySearch(r, 0, len - 1, a[len]);
            if ( i != len ) {
                for ( int j = len; j > i; j -- ) {
                    r[j] = r[j - 1];
                }
            }
            r[i] = a[len];
        }
        return r;
    }

    private static int binarySearch( int[] a, int f, int l, int x ) {

        int m = ( f + l ) / 2;
        int i = -1;
        if ( x > a[m] ) {
            if ( l > m + 1 ) {
                i = binarySearch(a, m + 1, l, x);
            }
            else {
                if ( x >= a[l]) {
                    i = l + 1;
                }
                else {
                    i = l;
                }
            }
        }
        else if ( x < a[m] ) {
            if ( f < m ) {
                i = binarySearch(a, f, m, x);
            }
            else {
                if ( x < a[f]) {
                    i = f;
                }
                else {
                    i = f + 1;
                }
            }
        }
        else if ( x == a[m] ) {
            i = m + 1;
        }
        return i;
    }
}