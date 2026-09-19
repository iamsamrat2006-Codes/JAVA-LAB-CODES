//SAMRAT_MUKHERJEE
//WAP IN JAVA to Accept an array and create separate arrays for even and odd numbers.


import java.util.Scanner;

public class SeparateEvenOdd_18 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Original array

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Take array input
        }

        int[] even = new int[n]; // Array to store even numbers
        int[] odd = new int[n];  // Array to store odd numbers

        int evenCount = 0;
        int oddCount = 0;

        // Separate elements into even and odd arrays
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evenCount] = arr[i]; // Store even number
                evenCount++;
            } else {
                odd[oddCount] = arr[i]; // Store odd number
                oddCount++;
            }
        }

        System.out.println("Even elements:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd elements:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
    }
  
}
