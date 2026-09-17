//SAMRAT_MUKHERJEE
//WAP IN JAVA  to Accept a number and display its multiplication table from 1 to 10.



import java.util.Scanner;
public class MultiplicationTABLE_7 {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Take number as input

        for (int i = 1; i <= 10; i++) { // Loop from 1 to 10
            System.out.println(n + " x " + i + " = " + (n * i));
            // Multiply n with i and display the result
        }
    } 
  
}
