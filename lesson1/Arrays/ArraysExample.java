
public class ArraysExample {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modify an element of the array
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // Iterate through the array using a for loop
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Iterate through the array using a for-each loop
        System.out.print("Array elements (for-each): ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Declare and initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print elements of the 2D array
        System.out.println("Element at (0,0): " + matrix[0][0]);
        System.out.println("Element at (1,1): " + matrix[1][1]);

        // Iterate through the 2D array using nested for loops
        System.out.println("2D array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
