package lab_03;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        System.out.println("Input: "
                + Arrays.toString(intArr));

        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

//        Arrays.sort(intArr);
        System.out.println("Expected output: "
                + Arrays.toString(intArr));
//        System.out.print("Sorted Array: ");
//        for (int num : intArr) {
//            System.out.print(num + " ");
//        }
    }
}
