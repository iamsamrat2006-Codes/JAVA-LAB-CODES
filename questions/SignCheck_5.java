//@SAMRAT_MUKHERJEE

//WAP in java to accept an integer and check whether it is positive, negative or zero.




import java.util.Scanner;
public class SignCheck_5 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Take number as input

        if (n > 0) { // Check if number is greater than 0
            System.out.println("Positive");
        } else if (n < 0) { // Check if number is less than 0
            System.out.println("Negative");
        } else {
            System.out.println("Zero"); // If neither positive nor negative
        }
    }
}
