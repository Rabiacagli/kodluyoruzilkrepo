// Java program to sort an array of numbers
public class SortArray {

    // A method to sort the array in ascending order
    public static void sort(int[] arr) {
        // Loop through the array from 0 to length - 1
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the smallest element in the subarray from i to length - 1
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the smallest element with the element at index i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // A method to print the array elements
    public static void print(int[] arr) {
        // Loop through the array and print each element
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // The main method to test the program
    public static void main(String[] args) {
        // Create an array of numbers
        int[] numbers = {5, 3, 8, 2, 9, 1, 4, 7, 6};
        // Print the original array
        System.out.println("Original array:");
        print(numbers);
        // Sort the array
        sort(numbers);
        // Print the sorted array
        System.out.println("Sorted array:");
        print(numbers);
    }
}
