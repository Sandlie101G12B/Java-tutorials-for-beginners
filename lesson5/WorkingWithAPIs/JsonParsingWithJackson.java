
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsingWithJackson {

    public static void main(String[] args) {
        // JSON string to be parsed
        String jsonString = "{\"name\":\"John\", \"age\":30}";

        // ObjectMapper is the main class for parsing JSON in Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Parsing JSON string to Person object
            Person person = objectMapper.readValue(jsonString, Person.class);
            // Printing parsed data
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {

    private String name;
    private int age;

    // Getters and setters for the fields
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
