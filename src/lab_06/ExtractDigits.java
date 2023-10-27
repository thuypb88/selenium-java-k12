package lab_06;
import java.util.Scanner;
public class ExtractDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String myStr = scanner.nextLine();

        String extractedDigits = extractDigits(myStr);
        System.out.println("Extracted digits: " + extractedDigits);
        scanner.close();
    }

    public static String extractDigits(String input) {
        String result = "";

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                result += c;
            }
        }

        return result;
    }

}
