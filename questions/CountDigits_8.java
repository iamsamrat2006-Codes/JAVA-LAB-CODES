//SAMRAT_MUKHERJEE
//WAP IN JAVA to accept an integer and count the number of digits in it.


import java.util.Scanner;
public class CountDigits_8 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter an integer: ");
        int n = sc.nextInt(); // Take integer as input

        n = Math.abs(n); // Convert negative number to positive
        int count = 0; // Initialize digit count

        if (n == 0) {
            count = 1; // Zero has one digit
        } else {
            while (n != 0) { // Continue until all digits are removed
                n = n / 10; // Remove the last digit
                count++; // Increase digit count by 1
            }
        }

        System.out.println("Number of digits = " + count);
    }
  
}
