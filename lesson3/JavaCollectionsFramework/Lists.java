
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.TreeMap;

public class Lists {

    public static void main(String[] args) {
        // Lists are collections that allow duplicate elements and maintain the order of insertion.

        // ArrayList is an implementation of the List interface that uses a dynamic array for storage.
        // It allows random access to elements.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // LinkedList is an implementation of the List interface that uses a doubly linked list for storage.
        // It allows efficient insertion and removal of elements.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Uno");
        treeMap.put(2, "Dos");
        treeMap.put(3, "Tres");

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}
