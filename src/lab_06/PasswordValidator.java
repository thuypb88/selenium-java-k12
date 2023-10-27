package lab_06;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        String correctPassword = "password123";
        int maxAttempts = 3;

        boolean accessGranted = validatePassword(correctPassword, maxAttempts);

        if (accessGranted) {
            System.out.println("Password accepted. Access granted.");
        } else {
            System.out.println("Maximum attempts reached. Access denied.");
        }
    }

    public static boolean validatePassword(String correctPassword, int maxAttempts) {
        Scanner scanner = new Scanner(System.in);

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Enter the password: ");
            String userPassword = scanner.nextLine();

            if (userPassword.equals(correctPassword)) {
                scanner.close();
                return true;
            } else {
                System.out.println("Incorrect password. Attempts left: " + (maxAttempts - attempts));
            }
        }

        scanner.close();
        return false;
    }


}
