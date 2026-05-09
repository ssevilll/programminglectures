public class Volatile {
    static volatile boolean running = true;
    // The 'volatile' keyword ensures that changes to the 'running' variable are
    // visible to all threads immediately.

    // without 'volatile', the thread might cache the value of 'running' and never
    // see the change, leading to an infinite loop.

    // volatile is not atomic(not thread-safe), so if we had multiple threads modifying 'running', we
    // could run into race conditions. In this example, we only have one thread
    // modifying 'running', so it is safe to use 'volatile'.
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (running) {
                // do something
            }
            System.out.println("Thread stopped.");
        });
        t.start();
        running = false;
    }
}