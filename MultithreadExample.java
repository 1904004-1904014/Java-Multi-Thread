// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
    private String message;

    // Constructor to initialize the message
    public MyRunnable(String message) {
        this.message = message;
    }

    // Implement the run method of the Runnable interface
    public void run() {
        // Code that will run concurrently in a separate thread
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class MultithreadExample {
    public static void main(String[] args) {
        // Create instances of the Runnable class
        MyRunnable runnable1 = new MyRunnable("Hello");
        MyRunnable runnable2 = new MyRunnable("World");

        // Create threads and pass the instances of Runnable to them
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
