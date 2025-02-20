
import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        // The Optional class in Java is used to represent a value that may or may not be present.
        // It helps to avoid null pointer exceptions.

        // Create an Optional object that may or may not contain a value
        Optional<String> optional = Optional.ofNullable(null);

        // Check if a value is present
        if (optional.isPresent()) {
            // Get and print the value if present
            System.out.println("Value: " + optional.get());
        } else {
            // Print a message if the value is not present
            System.out.println("Value is not present");
        }

        // Use ifPresent to execute a lambda expression if a value is present
        optional.ifPresent(value -> System.out.println("Value: " + value));

        // Create an Optional object with a non-null value
        Optional<String> nonEmptyOptional = Optional.of("Hello");

        // Get the value using orElse
        String value = nonEmptyOptional.orElse("Default Value");
        System.out.println("Value: " + value);

        // Get the value using orElseGet
        value = nonEmptyOptional.orElseGet(() -> "Default Value");
        System.out.println("Value: " + value);

        // Throw an exception if the value is not present
        try {
            value = optional.orElseThrow(() -> new IllegalStateException("Value is not present"));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
