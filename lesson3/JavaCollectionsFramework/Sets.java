
import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        // Sets are collections that do not allow duplicate elements.

        // HashSet is an implementation of the Set interface that uses a hash table for storage.
        // It does not guarantee any specific order of elements.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        // TreeSet is an implementation of the Set interface that uses a tree for storage.
        // It stores elements in a sorted order.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Cow");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}
