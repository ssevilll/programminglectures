class Counter {
    int count = 0;
    boolean bChanged = false; // controls the order of increment and getCount

    public synchronized void increment() {
        while (bChanged) {
            try {
                wait(); // means that the increment thread will wait until the getCount thread has read the count and set bChanged to false
            } catch (InterruptedException iex) {
                System.out.println("Err: " + iex);
            }
        }
        count++;
        System.out.println("Increment: " + count);
        bChanged = true;
        notify(); // means that the increment thread will notify the getCount thread that it has incremented the count and set bChanged to true
        // notify() doesn't know which thread to wake up, so it will wake up one of the threads that are waiting on the same object. In this case, it will wake up the getCount thread.
    }

    public synchronized int getCount() {
        while (!bChanged) {
            try {
                wait(); // means that the getCount thread will wait until the increment thread has incremented the count and set bChanged to true
            } catch (InterruptedException iex) {
                System.out.println("Err: " + iex);
            }
        }
        System.out.println("Get: " + count);
        bChanged = false;
        notify();
        return count;
    }

}

class Incrementor implements Runnable {
    Counter cnt;

    public Incrementor(Counter c) {
        cnt = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            cnt.increment();
    }
}

class CountReader implements Runnable {
    Counter cnt;

    public CountReader(Counter c) {
        cnt = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            cnt.getCount();
    }
}

class WaitAndNotify {
    public static void main(String[] args) {
        Counter cnt = new Counter();

        Incrementor inc = new Incrementor(cnt);
        CountReader cr = new CountReader(cnt);

        Thread t1 = new Thread(inc);
        Thread t2 = new Thread(cr);

        t1.start();
        t2.start();
    }
}