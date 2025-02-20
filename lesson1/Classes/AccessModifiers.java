
public class AccessModifiers {

    public static void main(String[] args) {
        Animal animal = new Animal(); // Create a new Animal object
        animal.setName("Lion"); // Set the name of the animal
        System.out.println("Animal name: " + animal.getName()); // Print the name of the animal
    }
}

class Animal {

    private String name; // Private field to store the name of the animal

    // Setter method to set the name of the animal
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the name of the animal
    public String getName() {
        return name;
    }

    // Public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }
}
