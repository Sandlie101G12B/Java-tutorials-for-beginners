
abstract class Animal {

    // Abstraction allows us to define methods that must be implemented by subclasses.
    // This is an abstract method.
    public abstract void sound();
}

class Dog extends Animal {

    // Implementing the abstract method for Dog
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

interface AnimalInterface {

    // Interfaces can also be used to achieve abstraction.
    void sound();
}

class Cat implements AnimalInterface {

    // Implementing the interface method for Cat
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        // Creating an instance of Dog
        Animal myDog = new Dog();
        myDog.sound(); // Outputs: The dog barks.

        // Creating an instance of Cat
        AnimalInterface myCat = new Cat();
        myCat.sound(); // Outputs: The cat meows.
    }
}
