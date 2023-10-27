package lab_03;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 16, 28, 34};
        int[] arr2 = {1, 13, 16, 27, 99};

        System.out.println("Array 01: "
                + Arrays.toString(arr1));
        System.out.println("Array 02: "
                + Arrays.toString(arr2));

        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < m) {
            merged[k++] = arr1[i++];
        }

        while (j < n) {
            merged[k++] = arr2[j++];
        }

        System.out.print("Expected output: " + Arrays.toString(merged));

    }
}
