
public class GarbageCollection {

    public static void main(String[] args) {
        // Garbage collection is the process of automatically reclaiming memory
        // by destroying objects that are no longer reachable.

        // Create an object of GarbageCollection
        GarbageCollection obj = new GarbageCollection();

        // Set the object reference to null, making it eligible for garbage collection
        obj = null;

        // Request garbage collection
        System.gc();
        System.out.println("Garbage collection requested.");
    }

    @Override
    protected void finalize() throws Throwable {
        // The finalize method is called by the garbage collector before an object is destroyed.
        // It can be overridden to perform cleanup operations.
        System.out.println("Garbage collector called.");
    }
}
