
public class ControlFlow {

    public static void main(String[] args) {
        int number = 10; // Declare and initialize an integer variable

        // if-else statement
        if (number > 0) {
            System.out.println("Positive number"); // Executes if number is greater than 0
        } else {
            System.out.println("Non-positive number"); // Executes if number is not greater than 0
        }

        // switch statement
        int day = 3; // Declare and initialize an integer variable representing a day
        switch (day) {
            case 1:
                System.out.println("Monday"); // Executes if day is 1
                break;
            case 2:
                System.out.println("Tuesday"); // Executes if day is 2
                break;
            case 3:
                System.out.println("Wednesday"); // Executes if day is 3
                break;
            default:
                System.out.println("Other day"); // Executes if day is not 1, 2, or 3
                break;
        }

        // while loop
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count); // Executes while count is less than 5
            count++;
        }

        // do-while loop
        count = 0;
        do {
            System.out.println("Count in do-while: " + count); // Executes at least once
            count++;
        } while (count < 5);

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i); // Executes 5 times
        }

        // for-each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("For-each loop value: " + num); // Iterates through each element in the array
        }

        // break statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exits the loop when i is 5
            }
            System.out.println("Break example: " + i);
        }

        // continue statement
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skips the current iteration if i is even
            }
            System.out.println("Continue example: " + i);
        }
    }
}
