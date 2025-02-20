
public class JVMInternals {

    public static void main(String[] args) {
        // The JVM (Java Virtual Machine) manages memory through several areas:
        // - Heap: where all objects are allocated.
        // - Stack: where method calls and local variables are stored.
        // - Method Area: where class structures and static variables are stored.
        // - Native Method Stack: where native method calls are stored.

        // Print the maximum amount of memory that the JVM will attempt to use
        System.out.println("Heap Size: " + Runtime.getRuntime().maxMemory());

        // Print the number of available processors to the JVM
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
    }
}
