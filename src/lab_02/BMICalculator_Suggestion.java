package lab_02;

import java.util.Scanner;

public class BMICalculator_Suggestion {
    public static void main(String[] args){
        String category;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in meters (m): ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight in kilograms (kg): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * 2);

        if (bmi < 18.5) {
            System.out.println("BMI: " + String.format("%.2f", bmi));
            System.out.println("Category: Underweight");
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI: " + String.format("%.2f", bmi));
            System.out.println("Category: Normal weight");
            category = "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("BMI: " + String.format("%.2f", bmi));
            System.out.println("Category: Overweight");
            category = "Overweight";
        } else {
            System.out.println("Category: Obesity");
            category = "Obesity";
        }

        if (!category.equals("Normal weight")) {
            double targetWeight;
            if (category.equals("Underweight")) {
                targetWeight = 24.9 * height * 2;
                System.out.println("Suggestion: You may want to increase your weight by about "
                        + String.format("%.2f", (targetWeight - weight)) + " kg to reach a 'Normal weight'.");
            } else {
                targetWeight = 18.5 * height * 2;
                System.out.println("Suggestion: You may want to decrease your weight by about "
                        + String.format("%.2f", (weight - targetWeight)) + " kg to reach a 'Normal weight'.");
            }
        } else {
            System.out.println("You have a normal BMI. Keep up the good work!");
        }

        scanner.close();
    }
}
