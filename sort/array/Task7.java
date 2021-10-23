package by.epam.module2.sort.array;

//Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm .
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <=...<= bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.
public class Task7 {
    public static void main(String[] args) {
        int[] a = {1, 5, 8, 10, 11, 12, 14};
        int[] b = {2, 3, 4, 5, 8, 9};

        findPlacesForElements(a, b);

    }

    public static void findPlacesForElements(int[] a, int[] b) {
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            while (b[j] >= a[i] && b[j] <= a[i + 1]) {

                System.out.println("Element: " + b[j] + " should be placed between element: "
                        + a[i] + " and element: " + a[i + 1]);

                if (j < b.length - 1) {
                    j++;
                } else {
                    break;
                }
            }
        }
    }
}
