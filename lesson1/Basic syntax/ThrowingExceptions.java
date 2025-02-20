
public class ThrowingExceptions {

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or older");
        }
    }
}
