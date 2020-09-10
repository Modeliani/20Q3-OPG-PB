package pkg20q3.opg.pb.article.apps;

import java.util.Arrays;

public class ArrayApp {
    public static int[] getReverse(int[] array) {
        int[] returnVal = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            returnVal[i] = array[array.length - 1 - i];
        }

        return returnVal;
    }

    public static boolean isSymmetric(int[] array) {
        int n = (int) Math.floor(array.length / 2f);

        for (int i = 0; i < n; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{0, 1, 2};
        int[] a2 = new int[]{4, 3, 2, 1};
        int[] a3 = new int[]{0, 1, 2};
        int[] a4 = new int[]{0, 1, 2, 1, 0};
        int[] a5 = new int[]{0, 1, 2, 2, 1, 0};

        // Reverse
        System.out.println(Arrays.toString(getReverse(a1)) + " is the reverse of " + Arrays.toString(a1));
        System.out.println(Arrays.toString(getReverse(a2)) + " is the reverse of " + Arrays.toString(a2));

        // Equals
        System.out.println("Not equal: " + Arrays.equals(a1, a2));
        System.out.println("Equal: " + Arrays.equals(a1, a3));

        // Symmetrical
        System.out.println("Not symmetric: " + isSymmetric(a2));
        System.out.println("Not symmetric: " + isSymmetric(a3));
        System.out.println("Symmetric: " + isSymmetric(a4));
        System.out.println("Symmetric: " + isSymmetric(a5));
    }
}
