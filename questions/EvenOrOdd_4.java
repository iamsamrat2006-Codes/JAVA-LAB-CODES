//@SAMRAT_MUKHERJEE
// WAP in Java to accept an integer and check whether it is even or odd.



import java.util.Scanner;

public class EvenOrOdd_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter an integer: ");
        int n = sc.nextInt(); // Read an integer from user

        if (n % 2 == 0) { // Check if remainder after division by 2 is 0
            System.out.println("Even");
        } else {
            System.out.println("Odd"); // If remainder is not 0, number is odd
        }
    }
}
