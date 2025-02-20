
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpressions {

    public static void main(String[] args) {
        // Lambda expressions in Java provide a clear and concise way to represent
        // one method interface using an expression. They are used primarily to define
        // the inline implementation of a functional interface.

        // Create a lambda expression to add two integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Use the lambda expression to add 5 and 3, and print the result
        System.out.println("Sum: " + add.apply(5, 3));

        // Create a lambda expression to check if a number is even
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // Use the lambda expression to check if 4 is even, and print the result
        System.out.println("Is 4 even? " + isEven.test(4));

        // Create a lambda expression to print a message
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        // Use the lambda expression to print a message
        printMessage.accept("Hello, world!");
    }
}
