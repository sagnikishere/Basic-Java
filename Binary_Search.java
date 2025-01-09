import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search {
    // Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if element is found
            }
        }
        return -1; // Return -1 if  not found
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size and elements input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking the target element to search
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        // Linear Search
        int linearResult = linearSearch(arr, target);
        if (linearResult != -1) {
            System.out.println("Element found at index " + linearResult + " using Linear Search.");
        } else {
            System.out.println("Element not found using Linear Search.");
        }

        // Binary Search
        Arrays.sort(arr); // Sort the array for Binary Search
        System.out.println("Sorted Array for Binary Search: " + Arrays.toString(arr));
        int binaryResult = binarySearch(arr, target);
        if (binaryResult != -1) {
            System.out.println("Element found at index " + binaryResult + " using Binary Search.");
        } else {
            System.out.println("Element not found using Binary Search.");
        }

        sc.close();
    }
}

