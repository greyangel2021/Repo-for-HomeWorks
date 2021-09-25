/**
 * Java 1. Home Work Lesson 3.
 * @author Kayumov Rustem
 * @version 25.09.2021
 */
import java.util.Arrays;

class HomeWork3 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Array1 before: ");
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (array1[i] == 0) ? 1 : 0;
        }
        System.out.print("Array1 after: ");
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[100];
        for (int i = 0; i < 100; i++) {
            array2[i] = i + 1;
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Array3 before: ");
        System.out.println(Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        System.out.print("Array3 after: ");
        System.out.println(Arrays.toString(array3));

        int[][] array4 = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array4[i]));
        }

        int[] fillSameVall;
        int len = 10;
        int initialValue = 21;
        {
            int[] array5 = new int[len];
            for (int i = 0; i < len; i++) {
                array5[i] = initialValue;
                System.out.print(array5[i] + " ");
            }
        }
    }
}