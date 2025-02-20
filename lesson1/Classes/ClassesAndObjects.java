
public class ClassesAndObjects {

    public static void main(String[] args) {
        Car myCar = new Car(); // Create a new Car object
        myCar.setModel("Toyota"); // Set the model of the car
        System.out.println("Car model: " + myCar.getModel()); // Print the model of the car
    }
}

class Car {

    private String model; // Private field to store the model of the car

    // Setter method to set the model of the car
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method to get the model of the car
    public String getModel() {
        return model;
    }
}
