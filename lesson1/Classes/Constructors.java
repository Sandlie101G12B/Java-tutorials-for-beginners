
public class Constructors {

    public static void main(String[] args) {
        Person person = new Person("John", 25); // Create a new Person object with name "John" and age 25
        System.out.println("Name: " + person.getName()); // Print the name of the person
        System.out.println("Age: " + person.getAge()); // Print the age of the person
    }
}

class Person {

    private String name; // Private field to store the name of the person
    private int age; // Private field to store the age of the person

    // Constructor to initialize the name and age of the person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to get the name of the person
    public String getName() {
        return name;
    }

    // Getter method to get the age of the person
    public int getAge() {
        return age;
    }
}
