
class Counter {

    private int count = 0;

    // Synchronization ensures that only one thread can access the increment method at a time.
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Synchronization {

    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating two threads that will increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Starting the threads
        t1.start();
        t2.start();

        // Waiting for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the final count
        System.out.println("Count: " + counter.getCount()); // Outputs: Count: 2000
    }
}
