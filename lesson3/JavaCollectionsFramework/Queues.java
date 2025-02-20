
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.TreeSet;

public class Queues {

    public static void main(String[] args) {
        // Queues are collections that hold elements prior to processing.
        // They typically order elements in a FIFO (first-in-first-out) manner.

        // PriorityQueue is an implementation of the Queue interface that orders elements
        // based on their natural ordering or a specified comparator.
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);

        // Print the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // ArrayDeque is an implementation of the Deque interface that allows elements
        // to be added or removed from both ends.
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        // Print the ArrayDeque
        System.out.println("Deque: " + deque);

        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Elephant");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}
