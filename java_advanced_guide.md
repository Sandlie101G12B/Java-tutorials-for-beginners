# Advanced Java Guide

## Introduction
This guide covers advanced Java topics, building on the basics to help you become proficient in Java programming.

## Syntax
Java syntax is largely influenced by C and C++ but has fewer low-level facilities.

### Example
```java
// This is a comment
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Variables
Variables are containers for storing data values.

### Example
```java
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```

## Data Types
Java has a rich set of data types.

### Primitive Data Types
- **byte**: 8-bit integer
- **short**: 16-bit integer
- **int**: 32-bit integer
- **long**: 64-bit integer
- **float**: Single-precision floating-point
- **double**: Double-precision floating-point
- **char**: Single 16-bit Unicode character
- **boolean**: true or false

### Non-Primitive Data Types
- **String**
- **Arrays**
- **Classes**
- **Interfaces**

## Operators
Operators are used to perform operations on variables and values.

### Arithmetic Operators
- **+**: Addition
- **-**: Subtraction
- **\***: Multiplication
- **/**: Division
- **%**: Modulus

### Example
```java
int x = 5;
int y = 3;
System.out.println(x + y); // Output: 8
```

### Comparison Operators
- **==**: Equal to
- **!=**: Not equal to
- **>**: Greater than
- **<**: Less than
- **>=**: Greater than or equal to
- **<=**: Less than or equal to

### Example
```java
int x = 5;
int y = 3;
System.out.println(x > y); // Output: true
```

### Logical Operators
- **&&**: Logical and
- **||**: Logical or
- **!**: Logical not

### Example
```java
int x = 5;
int y = 3;
System.out.println(x > 3 && y < 5); // Output: true
```

## Control Flow
Control flow statements are used to control the flow of execution in a program.

### If-Else
```java
int x = 20;
if (x > 18) {
    System.out.println("x is greater than 18");
} else {
    System.out.println("x is not greater than 18");
}
```

### Switch
```java
int day = 4;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day");
}
```

### Loops
Loops are used to execute a block of code repeatedly.

#### For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

#### While Loop
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

#### Do-While Loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

## Arrays
Arrays are used to store multiple values in a single variable.

### Example
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]); // Output: Volvo
```

## Methods
Methods are used to perform certain actions, and they are also known as functions.

### Example
```java
public class Main {
    static void myMethod() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        myMethod();
    }
}
```

## Classes and Objects
Java is an object-oriented programming language. Everything in Java is associated with classes and objects.

### Example
```java
public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```

## Object-Oriented Programming (OOP)
Java is an object-oriented programming language. Understanding OOP principles is crucial for advanced Java programming.

### Encapsulation
Encapsulation is the mechanism of wrapping the data (variables) and code (methods) together as a single unit.

### Example
```java
public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
```

### Inheritance
Inheritance is a mechanism wherein a new class is derived from an existing class.

### Example
```java
class Animal {
    protected String name;

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();
        myDog.bark();
    }
}
```

### Polymorphism
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

### Example
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}
```

### Abstraction
Abstraction is the process of hiding the implementation details and showing only functionality to the user.

### Example
```java
abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();
    }
}
```

## Interfaces
An interface is a completely "abstract class" that is used to group related methods with empty bodies.

### Example
```java
interface Animal {
    public void animalSound();
    public void sleep();
}

class Dog implements Animal {
    public void animalSound() {
        System.out.println("The dog barks");
    }
    public void sleep() {
        System.out.println("The dog sleeps");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();
    }
}
```

## Exception Handling
Exception handling is a powerful mechanism to handle runtime errors.

### Example
```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
```

## Collections Framework
The Java Collections Framework provides a set of interfaces and classes to handle collections of objects.

### List
A List is an ordered collection (also known as a sequence).

### Example
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

### Set
A Set is a collection that cannot contain duplicate elements.

### Example
```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element

        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

### Map
A Map is an object that maps keys to values.

### Example
```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

## Generics
Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods.

### Example
```java
public class Main {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}
```

### Bounded Type Parameters
You can set bounds for type parameters to restrict the types that can be used.

### Example
```java
public class Main {
    public static <T extends Number> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        printArray(intArray);
        printArray(doubleArray);
    }
}
```

### Generic Methods
You can define methods with generic type parameters.

### Example
```java
public class Main {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}
```

## Lambda Expressions
Lambda expressions are used to provide the implementation of a functional interface.

### Example
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.forEach(fruit -> System.out.println(fruit));
    }
}
```

### Example with Functional Interface
```java
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true
    }
}
```

## Streams
Streams are used to process collections of objects.

### Example
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        list.stream()
            .filter(fruit -> fruit.startsWith("A"))
            .forEach(System.out::println);
    }
}
```

### Example with Stream Operations
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Date");

        List<String> result = list.stream()
            .filter(fruit -> fruit.startsWith("A"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        result.forEach(System.out::println); // Output: APPLE
    }
}
```

## Multithreading
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.

### Example
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```

### Example with Runnable Interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
```

## File I/O
Java provides several classes for file input and output.

### Example
```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myFile = new File("filename.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Hello, World!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### Example with BufferedReader and BufferedWriter
```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("filename.txt"));
            writer.write("Hello, World!");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("filename.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Networking
Java provides the `java.net` package for networking applications.

### Example
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            System.out.println(content.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### Example with ServerSocket and Socket
```java
import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String str = dis.readUTF();
            System.out.println("Message: " + str);
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## Reflection
Reflection is a feature in Java that allows an executing Java program to examine or "reflect" upon itself, and manipulate the internal properties of the program.

### Example
```java
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.util.ArrayList");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

### Example with Field Manipulation
```java
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.util.ArrayList");
            Field field = cls.getDeclaredField("size");
            field.setAccessible(true);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            System.out.println("Size before: " + field.get(list));
            field.set(list, 10);
            System.out.println("Size after: " + field.get(list));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## Annotations
Annotations provide metadata about the program and are used to provide information to the compiler, to be processed at runtime, or to be used by tools.

### Example
```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class Main {
    @MyAnnotation(value = "Hello")
    public void myMethod() {
        System.out.println("My Method");
    }

    public static void main(String[] args) {
        try {
            Method method = Main.class.getMethod("myMethod");
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
```

### Example with Custom Annotation
```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation {
    String value();
}

@MyAnnotation(value = "Hello")
public class Main {
    public static void main(String[] args) {
        MyAnnotation annotation = Main.class.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}
```

## Serialization
Serialization is the process of converting an object into a byte stream, and deserialization is the process of converting a byte stream back into an object.

### Example
```java
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Name: " + deserializedPerson.name + ", Age: " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

### Example with Externalizable Interface
```java
import java.io.*;

class Person implements Externalizable {
    String name;
    int age;

    public Person() {}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Name: " + deserializedPerson.name + ", Age: " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## JavaFX
JavaFX is a software platform for creating and delivering desktop applications, as well as rich internet applications.

### Example
```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Click Me");
        btn.setOnAction(e -> System.out.println("Hello, JavaFX!"));

        Scene scene = new Scene(btn, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Example with Scene and Stage
```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");
        Scene scene = new Scene(label, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## Theory of Java

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It was developed by Sun Microsystems (now owned by Oracle Corporation) and released in 1995. Java applications are typically compiled to bytecode that can run on any Java Virtual Machine (JVM) regardless of the underlying computer architecture.

One of the core principles of Java is its platform independence, which is achieved through the use of the JVM. The JVM allows Java programs to be written once and run anywhere, making Java a popular choice for cross-platform development. This is often referred to as the "write once, run anywhere" (WORA) capability of Java.

Java's object-oriented nature allows developers to create modular programs and reusable code. Key concepts of object-oriented programming (OOP) such as inheritance, encapsulation, polymorphism, and abstraction are integral to Java. These principles help in organizing complex programs, making them easier to manage and extend.

Java also emphasizes security and robustness. The language includes features such as automatic memory management (garbage collection), exception handling, and a strong type-checking mechanism. These features help in writing reliable and error-free code, reducing the likelihood of runtime errors and security vulnerabilities.

In addition to its core language features, Java has a rich standard library that provides a wide range of functionalities, from data structures and algorithms to networking and graphical user interface (GUI) development. The extensive ecosystem of third-party libraries and frameworks further enhances Java's capabilities, making it suitable for a wide variety of applications, including web development, enterprise software, mobile applications, and more.

# Using Common Java Libraries

## Introduction
Java libraries are collections of pre-written code that developers can use to optimize tasks. This guide covers how to use some commonly used Java libraries.

## Apache Commons

### Apache Commons Lang
Apache Commons Lang provides helper utilities for the java.lang API.

### Example
Add the dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.12.0</version>
</dependency>
```

### Usage
```java
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(StringUtils.reverse(str));
    }
}
```

### Apache Commons IO
Apache Commons IO provides utility classes for working with IO.

### Example
Add the dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.11.0</version>
</dependency>
```

### Usage
```java
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            FileUtils.writeStringToFile(file, "Hello, World!", "UTF-8");
            String content = FileUtils.readFileToString(file, "UTF-8");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Google Guava

### Google Guava
Google Guava provides a set of core libraries that include new collection types, immutable collections, and more.

### Example
Add the dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>31.0.1-jre</version>
</dependency>
```

### Usage
```java
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        ImmutableList<String> list = ImmutableList.of("Apple", "Banana", "Cherry");
        System.out.println(list);
    }
}
```

### Example with Optional
```java
import com.google.common.base.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
    }
}
```

## Jackson

### Jackson
Jackson is a suite of data-processing tools for Java, including the flagship JSON parsing and generation library.

### Example
Add the dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.0</version>
</dependency>
```

### Usage
```java
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"John\", \"age\":30}";
        try {
            Person person = mapper.readValue(json, Person.class);
            System.out.println(person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

## Log4j

### Log4j
Log4j is a reliable, fast, and flexible logging framework (APIs) written in Java.

### Example
Add the dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.14.1</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.14.1</version>
</dependency>
```

### Usage
```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Hello, Log4j!");
    }
}
```

## Hibernate

### Hibernate
Hibernate is an object-relational mapping (ORM) tool for the Java programming language.

### Example
Add the dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.5.7.Final</version>
</dependency>
```

### Usage
```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        session.save(person);
        session.getTransaction().commit();
        session.close();
    }
}

@Entity
@Table(name = "person")
class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

## Apache HttpClient

### Apache HttpClient
Apache HttpClient provides a robust and flexible solution for HTTP communication.

### Example
Add the dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.13</version>
</dependency>
```

### Usage
```java
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("https://api.github.com");

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Conclusion
This guide provides an overview of advanced Java topics. For more detailed information, refer to the [Oracle Java Documentation](https://docs.oracle.com/en/java/).
