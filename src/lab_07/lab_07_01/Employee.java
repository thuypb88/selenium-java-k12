package lab_07.lab_07_01;

public class Employee {
    String type;
    int salary;

    public Employee(String type) {
        this.type = type;
        if (type.equals("FTE")) {
            this.salary = 50000;
        } else if (type.equals("Contractor")) {
            this.salary = 40000;
        }
    }

    public int getSalary() {
        return salary;
    }
}
