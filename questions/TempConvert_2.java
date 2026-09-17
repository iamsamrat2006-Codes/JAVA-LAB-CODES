
//@SAMRAT_MUKHERJEE
//Accept temperature in Celsius and convert it into Fahrenheit. Formula: F = (C × 9/5) + 32

import java.util.Scanner;

class TempConvert_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble(); // Read temperature in Celsius

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the result
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);
    }
}
