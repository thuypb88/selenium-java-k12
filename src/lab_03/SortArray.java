package lab_03;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        System.out.println("Input: "
                + Arrays.toString(intArr));

        Arrays.sort(intArr);
        System.out.println("Expected output: "
                + Arrays.toString(intArr));
//        System.out.print("Sorted Array: ");
//        for (int num : intArr) {
//            System.out.print(num + " ");
//        }
    }
}
