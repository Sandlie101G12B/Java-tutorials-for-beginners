
public class Loops {

    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i); // Executes 5 times, i ranges from 0 to 4
        }

        // while loop
        int j = 0; // Initialize loop control variable
        while (j < 5) {
            System.out.println("While loop iteration: " + j); // Executes while j is less than 5
            j++; // Increment loop control variable
        }

        // do-while loop
        int k = 0; // Initialize loop control variable
        do {
            System.out.println("Do-while loop iteration: " + k); // Executes at least once
            k++; // Increment loop control variable
        } while (k < 5); // Condition is checked after the loop body
    }
}
