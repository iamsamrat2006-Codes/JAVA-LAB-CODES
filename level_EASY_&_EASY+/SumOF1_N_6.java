//@SAMRAT_MUKHERJEE
// WAP in Java to accept an integer N and print the sum of first N natural numbers.

import java.util.Scanner;
public class SumOF1_N_6 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter n: ");
        int n = sc.nextInt(); // Take n as input

        int sum = 0; // Initialize sum to 0

        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            sum = sum + i; // Add current number to sum
        }

        System.out.println("Sum = " + sum); // Display final sum
    }
}
