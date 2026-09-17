//SAMRAT_MUKHERJEE
//WAP IN JAVA to accept an integer and reverse it.



import java.util.Scanner;
public class ReverseInteger_9 { 
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter an integer: ");
        int n = sc.nextInt(); // Take number as input

        int reverse = 0; // Initialize reverse number

        while (n != 0) { // Repeat until all digits are processed
            int digit = n % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Add digit to reversed number
            n = n / 10; // Remove the last digit from original number
        }

        System.out.println("Reverse = " + reverse); // Display reversed number
    }
  
}
