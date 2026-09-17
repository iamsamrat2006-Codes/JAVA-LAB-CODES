//SAMRAT_MUKHERJEE
//WAP IN JAVA to accept an integer and calculate the sum of its digits.



import java.util.Scanner;
public class SumOfDigits_10 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter an integer: ");
        int n = sc.nextInt(); // Take number as input

        n = Math.abs(n); // Convert negative number to positive
        int sum = 0; // Initialize sum

        while (n != 0) { // Repeat until all digits are processed
            int digit = n % 10; // Extract the last digit
            sum = sum + digit; // Add digit to sum
            n = n / 10; // Remove the last digit
        }

        System.out.println("Sum of digits = " + sum); // Display final sum
    }
  
}
