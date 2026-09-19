//SAMRAT_MUKHERJEE
//WAP IN JAVA to Accept n integers and find the second-largest element without sorting the array.


import java.util.Scanner;
public class SecondLargest_16 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Create array

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Take array input
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest without sorting
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Previous largest becomes second largest
                largest = arr[i]; // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]; // Update second largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
  
}
