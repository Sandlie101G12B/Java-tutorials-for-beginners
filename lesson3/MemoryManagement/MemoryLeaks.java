
import java.util.ArrayList;
import java.util.List;

public class MemoryLeaks {

    public static void main(String[] args) {
        // Memory leaks occur when objects are no longer needed but are not released,
        // causing the application to consume more memory over time.

        // Example of a memory leak:
        // Create a list to hold strings
        List<String> list = new ArrayList<>();

        // Infinite loop to continuously add strings to the list
        while (true) {
            list.add("Memory Leak");
        }
    }
}
