
//@SAMRAT_MUKHERJEE
//Accept temperature in Celsius and convert it into Fahrenheit. Formula: F = (C × 9/5) + 32

import java.util.Scanner;

class TempConvert_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float celcius;

        System.out.println("--- INPUT ---");
        System.out.print(" - Temperature in °C: ");
        celcius = sc.nextFloat();

        float fahrenheit = (celcius * 9 / 5) + 32; 
        System.out.println("\n--- OUTPUT ---");
        System.out.println(celcius + "°C" + " = " + fahrenheit + "°F");
    }
}
