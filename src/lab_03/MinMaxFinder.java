package lab_03;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int max = intArr[0]; // Assume the first element is the maximum initially
        int min = intArr[0]; // Assume the first element is the minimum initially
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i]; // Update maximum value
            }
            if (intArr[i] < min) {
                min = intArr[i]; // Update minimum value
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

    }
}
