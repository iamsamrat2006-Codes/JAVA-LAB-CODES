//SAMRAT_MUKHERJEE
//WAP IN JAVA to Accept an integer array and determine how many times each distinct element occurs.




import java.util.Scanner;
public class FrequencyOfElements_17 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Create array

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Take array input
        }

        boolean[] visited = new boolean[n];
        // visited array keeps track of elements already counted

        System.out.println("Frequency of elements:");

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue; // Skip if this element was already counted
            }

            int count = 1; // Start frequency from 1

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++; // Increase frequency if elements are same
                    visited[j] = true; // Mark duplicate as counted
                }
            }

            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }
    }
  
}
