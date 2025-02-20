
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestingWithJUnit {

    // Unit testing is a type of software testing where individual units or components of a software are tested.
    // JUnit is a popular framework for unit testing in Java.
    @Test
    public void testAddition() {
        // The assertEquals method checks if the expected value matches the actual value.
        assertEquals(5, add(2, 3));
    }

    // This method adds two integers and returns the result.
    public int add(int a, int b) {
        return a + b;
    }
}
