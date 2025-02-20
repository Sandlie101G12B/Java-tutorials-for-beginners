// Interface for Shape

interface Shape {

    void draw();
}

// Implementation of Circle
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Implementation of Square
class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

// Factory class to generate objects of concrete classes based on given information
class ShapeFactory {

    // Method to get an object of a specific shape type
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

// Main class to demonstrate the Factory pattern
public class FactoryPattern {

    public static void main(String[] args) {
        // Create a ShapeFactory object
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if (shape1 != null) {
            shape1.draw();
        } else {
            System.out.println("Shape not found.");
        }

        // Get an object of Square and call its draw method
        Shape shape2 = shapeFactory.getShape("SQUARE");
        if (shape2 != null) {
            shape2.draw();
        } else {
            System.out.println("Shape not found.");
        }

        // Attempt to get an object of an unknown shape type
        Shape shape3 = shapeFactory.getShape("TRIANGLE");
        if (shape3 != null) {
            shape3.draw();
        } else {
            System.out.println("Shape not found.");
        }
    }
}
