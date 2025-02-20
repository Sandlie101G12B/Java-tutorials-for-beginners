
public class SingletonPattern {

    // Static variable to hold the single instance of the class
    private static SingletonPattern instance;

    // Private constructor to prevent instantiation from other classes
    private SingletonPattern() {
    }

    // Public method to provide access to the single instance
    public static SingletonPattern getInstance() {
        if (instance == null) {
            // Create the instance if it does not exist
            instance = new SingletonPattern();
        }
        // Return the single instance
        return instance;
    }

    // Method to display a message
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Get the single instance of SingletonPattern
        SingletonPattern singleton = SingletonPattern.getInstance();
        // Call the showMessage method
        singleton.showMessage();
    }
}
