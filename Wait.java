class Shared {

    synchronized void waitMethod() {

        try {
            System.out.println("Waiting...");
            wait();
            // The 'wait()' method causes the current thread to wait until another thread
            // calls 'notify()' or 'notifyAll()' on the same object.

            System.out.println("Resumed");
        } catch (Exception e) {
        }
    }

    synchronized void notifyMethod() {

        System.out.println("Notifying...");
        notify();
        // The 'notify()' method wakes up a single thread that is waiting on the
        // object's monitor. If multiple threads are waiting, one of them is chosen to
        // be awakened. The awakened thread will not run immediately; it will only run
        // after the current thread releases the lock on the object.
    }
}

public class Wait {

    public static void main(String[] args) {

        Shared s = new Shared();

        Thread t1 = new Thread(() -> {
            s.waitMethod();
        });

        Thread t2 = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }

            s.notifyMethod();
        });

        t1.start();
        t2.start();
    }
}