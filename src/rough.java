import java.util.Scanner;
public class rough {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Input array
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 2: Input element to search
            System.out.print("Enter the element to search: ");
            int key = sc.nextInt();

            // Step 3: Call linear search
            int index = linearSearch(arr, key);

            // Step 4: Output result
            if (index == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at index: " + arr);
            }

            sc.close();
        }

        // Linear search method
        public static int linearSearch(int[] arr, int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return arr[i]; // return index if found
                }
            }
            return -1; // element not found
        }
    }


