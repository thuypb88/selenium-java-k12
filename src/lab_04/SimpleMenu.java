package lab_04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleMenu {
    static ArrayList<Integer> numbers = generateRandomNumbers();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userOption;
        do {
            printGameMenu();
            userOption = getUserOption(scanner);

            switch (userOption){
                case 1:
                    printAllNumbers();
                    break;
                case 2:
                    printMaximumValue();
                    break;
                case 3:
                    printMinimumValue();
                    break;
                case 4:
                    searchNumber();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (userOption != 0);
        scanner.close();
    }

    public static void printGameMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("0. Exit");
    }

    public static int getUserOption(Scanner scanner){
        System.out.print("Please enter your option: ");
        return scanner.nextInt();
    }

    public static ArrayList<Integer> generateRandomNumbers() {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(1000));
        }

        return numbers;
    }

    public static void printAllNumbers() {
        System.out.println("All numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printMaximumValue() {
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }

    public static void printMinimumValue() {
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum value: " + min);
    }

    public static void searchNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to search: ");
        int searchNum = scanner.nextInt();

        int index = numbers.indexOf(searchNum);

        if (index != -1) {
            System.out.println("Number " + searchNum + " found at index " + index);
        } else {
            System.out.println("Number " + searchNum + " not found in the list.");
        }
    }
}
