
public class Operators {

    public static void main(String[] args) {
        int a = 10; // Declare and initialize an integer variable a
        int b = 5; // Declare and initialize an integer variable b

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // Adds a and b
        System.out.println("Subtraction: " + (a - b)); // Subtracts b from a
        System.out.println("Multiplication: " + (a * b)); // Multiplies a and b
        System.out.println("Division: " + (a / b)); // Divides a by b
        System.out.println("Modulus: " + (a % b)); // Remainder of a divided by b

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // Checks if a is equal to b
        System.out.println("Not equal to: " + (a != b)); // Checks if a is not equal to b
        System.out.println("Greater than: " + (a > b)); // Checks if a is greater than b
        System.out.println("Less than: " + (a < b)); // Checks if a is less than b

        // Logical Operators
        boolean x = true; // Declare and initialize a boolean variable x
        boolean y = false; // Declare and initialize a boolean variable y
        System.out.println("Logical AND: " + (x && y)); // Logical AND operation
        System.out.println("Logical OR: " + (x || y)); // Logical OR operation
        System.out.println("Logical NOT: " + (!x)); // Logical NOT operation
    }
}
