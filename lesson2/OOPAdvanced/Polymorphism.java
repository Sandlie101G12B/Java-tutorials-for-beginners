
class Animal {

    // Polymorphism allows methods to do different things based on the object it is acting upon.
    // This method will be overridden in subclasses.
    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {

    // Overriding the sound method for Dog
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {

    // Overriding the sound method for Cat
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        // Polymorphism allows us to use a superclass reference to refer to a subclass object.
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // The actual method that gets called is determined at runtime.
        myDog.sound(); // Outputs: The dog barks.
        myCat.sound(); // Outputs: The cat meows.
    }
}
