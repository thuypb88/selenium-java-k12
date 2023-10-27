package lab_03;

public class OddEvenCounter {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : intArr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
