//SAMRAT_MUKHERJEE

//WAP IN JAVA to Rotate an array to the right by k positions.
/*MAIN LOGIC: Take input of array and k, then create a new array and place each element at its new rotated position using the formula (i + k) % n.
rotated[(i + k) % n] = arr[i];*/




import java.util.Scanner;

public class ArrayRotation_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Take array input
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt(); // Number of positions to rotate

        k = k % n; // Handle k greater than array size

        int[] rotated = new int[n];

        // Place each element at its new rotated position
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Array after right rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}