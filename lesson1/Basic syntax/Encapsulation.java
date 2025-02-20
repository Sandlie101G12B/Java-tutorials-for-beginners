
public class Encapsulation {

    public static void main(String[] args) {
        Student student = new Student(); // Create a new Student object
        student.setName("Alice"); // Set the name of the student
        student.setAge(20); // Set the age of the student

        System.out.println("Name: " + student.getName()); // Print the name of the student
        System.out.println("Age: " + student.getAge()); // Print the age of the student
    }
}

class Student {

    private String name; // Private field to store the name of the student
    private int age; // Private field to store the age of the student

    // Getter method to get the name of the student
    public String getName() {
        return name;
    }

    // Setter method to set the name of the student
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the age of the student
    public int getAge() {
        return age;
    }

    // Setter method to set the age of the student
    public void setAge(int age) {
        this.age = age;
    }
}
