//SAMRAT_MUKHERJEE
//WAP IN JAVA to Create an Employee class with ID, name, and basic salary. Calculate HRA (20%), DA(10%), and gross salary.


class Employee {
    int id;
    String name;
    double basicSalary;

    // Constructor to initialize employee details
    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate HRA = 20% of basic salary
    double calculateHRA() {
        return basicSalary * 0.20;
    }

    // Method to calculate DA = 10% of basic salary
    double calculateDA() {
        return basicSalary * 0.10;
    }

    // Method to calculate gross salary
    double grossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Method to display employee details
    void display() {
        System.out.println("ID           : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA          : " + calculateHRA());
        System.out.println("DA           : " + calculateDA());
        System.out.println("Gross Salary : " + grossSalary());
    }
}

public class EmployeeSalary_15 {
    public static void main(String[] args) {

        // Create Employee object
        Employee e = new Employee(101, "ROHIT SHARMA", 30000);

        // Display employee salary details
        e.display();
    }
}