
public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[5]; // Declare an array of integers with size 5
        arr[0] = 10; // Initialize the first element
        arr[1] = 20; // Initialize the second element
        arr[2] = 30; // Initialize the third element
        arr[3] = 40; // Initialize the fourth element
        arr[4] = 50; // Initialize the fifth element

        // Loop through the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
