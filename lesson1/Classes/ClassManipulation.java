
public class ClassManipulation {

    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("John", 25);

        // Access and modify fields using getter and setter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Jane");
        person.setAge(30);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Call a method of the Person class
        person.displayInfo();
    }
}

// Define the Person class
class Person {

    // Private fields
    private String name;
    private int age;

    // Constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Person Info: Name = " + name + ", Age = " + age);
    }
}
