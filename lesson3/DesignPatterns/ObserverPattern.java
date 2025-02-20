import java.util.ArrayList;
import java.util.List;

// Observer interface with an update method
interface Observer {
    void update(String message);
}

// Subject class that maintains a list of observers
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    // Method to add an observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all observers of a change
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Method to set a new message and notify observers
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

// Concrete implementation of Observer
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

// Main class to demonstrate the Observer pattern
public class ObserverPattern {
    public static void main(String[] args) {
        // Create a Subject object
        Subject subject = new Subject();

        // Create Observer objects
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        // Add observers to the subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Set a new message and notify observers
        subject.setMessage("Hello, Observers!");

        // Remove an observer and set a new message
        subject.removeObserver(observer1);
        subject.setMessage("Observer 1 has been removed.");
    }
}
