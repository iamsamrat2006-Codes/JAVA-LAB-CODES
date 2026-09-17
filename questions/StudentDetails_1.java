//@SAMRAT_MUKHERJEE

// WAP in Java to accept a student's name, roll number, age, and department.
// Display the information in a properly formatted form..


import java.util.Scanner;

class StudentDetails_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Name: ");
        String name = sc.nextLine();

        System.out.print(" - Roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print(" - Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print(" - Department: ");
        String department = sc.nextLine();

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Roll number : " + rollNumber);
        System.out.println("Department  : " + department);
    }
}

//difference between .nextint() and .nextLine() is that .nextInt() reads only the integer value and does not consume the newline character, while .nextLine() reads the entire line of input including spaces and consumes the newline character. This can lead to issues when mixing these two methods, as seen in the code where we call sc.nextLine() after sc.nextInt() to consume the leftover newline character.