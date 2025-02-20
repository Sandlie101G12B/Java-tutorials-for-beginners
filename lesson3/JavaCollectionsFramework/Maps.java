
import java.util.HashMap;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class Maps {

    public static void main(String[] args) {
        // Maps are collections that store key-value pairs.

        // HashMap is an implementation of the Map interface that uses a hash table for storage.
        // It does not guarantee any specific order of elements.
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Tree Map is an implementation of the Map interface that uses a tree for storage.
        // It stores elements in a sorted order based on the keys.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Uno");
        treeMap.put(2, "Dos");
        treeMap.put(3, "Tres");

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);

        // Print the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Create an ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");

        // Print the ArrayDeque
        System.out.println("Deque: " + deque);
    }
}
