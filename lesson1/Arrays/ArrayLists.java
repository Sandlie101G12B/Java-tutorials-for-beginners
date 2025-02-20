import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        // Create a new ArrayList to hold String elements
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Iterate through the ArrayList and print each element
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
