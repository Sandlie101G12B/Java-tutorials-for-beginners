
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI {

    public static void main(String[] args) {
        // The Streams API in Java provides a functional approach to processing collections of objects.
        // It allows operations such as filtering, mapping, and reducing.

        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use the stream API to filter numbers greater than 5
        List<Integer> filteredNumbers = numbers.stream()
                .filter(x -> x > 5) // Filter numbers greater than 5
                .collect(Collectors.toList()); // Collect the result into a list

        // Print the filtered numbers
        System.out.println("Filtered Numbers: " + filteredNumbers);

        // Use the stream API to map numbers to their squares
        List<Integer> squaredNumbers = numbers.stream()
                .map(x -> x * x) // Map each number to its square
                .collect(Collectors.toList()); // Collect the result into a list

        // Print the squared numbers
        System.out.println("Squared Numbers: " + squaredNumbers);

        // Use the stream API to find the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // Reduce the stream to the sum of its elements

        // Print the sum
        System.out.println("Sum of Numbers: " + sum);

        // Use the stream API to find the maximum number
        int max = numbers.stream()
                .max(Integer::compare).orElseThrow(); // Find the maximum number

        // Print the maximum number
        System.out.println("Maximum Number: " + max);

        // Use the stream API to find the minimum number
        int min = numbers.stream()
                .min(Integer::compare).orElseThrow(); // Find the minimum number

        // Print the minimum number
        System.out.println("Minimum Number: " + min);
    }
}
