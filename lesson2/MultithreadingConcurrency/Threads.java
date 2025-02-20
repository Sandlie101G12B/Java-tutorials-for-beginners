
class MyThread extends Thread {

    // The run method contains the code that constitutes the new thread.
    public void run() {
        System.out.println("Thread is running.");
    }
}

class MyRunnable implements Runnable {

    // The run method contains the code that constitutes the new thread.
    public void run() {
        System.out.println("Runnable is running.");
    }
}

public class Threads {

    public static void main(String[] args) {
        // Creating a new thread by extending the Thread class
        MyThread thread = new MyThread();
        thread.start(); // Starts the thread and calls the run method

        // Creating a new thread by implementing the Runnable interface
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start(); // Starts the thread and calls the run method
    }
}
