
//@SAMRAT_MUKHERJEE

// WAP in Java to accept a student's name, roll number, age, and department.
// Display the information in a properly formatted form..


import java.util.Scanner;

class StudentDetails_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter student name: ");
        String name = sc.nextLine(); // Read student's name

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt(); // Read roll number

        System.out.print("Enter age: ");
        int age = sc.nextInt(); // Read student's age

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter department: ");
        String department = sc.nextLine(); // Read department

        // Display student information in a formatted form
        System.out.println("\n----- Student Information -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
    }
}

//difference between .nextint() and .nextLine() is that .nextInt() reads only the integer value and does not consume the newline character, while .nextLine() reads the entire line of input including spaces and consumes the newline character. This can lead to issues when mixing these two methods, as seen in the code where we call sc.nextLine() after sc.nextInt() to consume the leftover newline character.