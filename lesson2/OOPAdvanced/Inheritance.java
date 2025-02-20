
class Animal {

    // Inheritance allows a class to inherit fields and methods from another class.
    // This method will be inherited by subclasses.
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {

    // This method is specific to the Dog class.
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog();

        // The Dog class inherits the eat method from the Animal class.
        myDog.eat(); // Outputs: This animal eats food.
        myDog.bark(); // Outputs: The dog barks.
    }
}
