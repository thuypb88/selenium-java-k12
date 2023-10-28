package lab_07.lab_07_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployees(String type, int count) {
        for (int i = 0; i < count; i++) {
            employees.add(new Employee(type));
        }
    }

    public int calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Full Time Employees (FTE): ");
        int numFTE = scanner.nextInt();
        company.addEmployees("FTE", numFTE);

        System.out.print("Enter the number of Contractors: ");
        int numContractors = scanner.nextInt();
        company.addEmployees("Contractor", numContractors);

        int totalSalary = company.calculateTotalSalary();
        System.out.println("Total Salary: " + totalSalary);

        scanner.close();
    }
}
