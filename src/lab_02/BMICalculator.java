package lab_02;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in meters (m): ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight in kilograms (kg): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * 2);

        if (bmi < 18.5) {
            System.out.println("BMI: " + bmi);
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI: " + bmi);
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("BMI: " + bmi);
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obesity");
        }

        scanner.close();
    }

}
