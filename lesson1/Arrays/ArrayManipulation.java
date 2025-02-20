import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {5, 3, 8, 1, 2};

        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Fill the array with a specific value
        Arrays.fill(numbers, 10);
        System.out.println("Array filled with 10: " + Arrays.toString(numbers));

        // Copy the array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Compare two arrays
        boolean areEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are the original and copied arrays equal? " + areEqual);

        // Search for an element in the array
        int index = Arrays.binarySearch(numbers, 10);
        System.out.println("Index of element 10: " + index);

        // Declare and initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        System.out.println("2D array: " + Arrays.deepToString(matrix));
    }
}
