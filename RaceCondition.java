public class RaceCondition {
    public static void main(String[] args)
            throws InterruptedException {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);
        Thread thread3 = new Thread(counter2);
        Thread thread4 = new Thread(counter2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        // start method is called to begin the execution of the threads. Each thread
        // will run the run() method of the Counter class, which will increment the
        // count variable 1000 times.

        // The join() method is called to ensure that the main thread waits for all the
        // worker threads to finish before proceeding. This is important because we want
        // to make sure that all increments to the counter are completed before we print
        // the final count. If we didn't call join(), the main thread might print the
        // count before all increments are done, leading to an incorrect result due to
        // the race condition.
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Final count: " + counter.getCount());
    }
}

class Counter implements Runnable {
    // if we make the count static, it will be shared among all instances of the
    // Counter class, which means that all threads will be incrementing the same
    // count variable. This can lead to a race condition, where multiple threads are
    // trying to update the count variable at the same time, resulting in an
    // unpredictable final count.
    private static int count = 0;

    // but at the same time if we make the method synchronized, it will ensure that
    // only one thread can access the method at a time, which can help to prevent
    // race conditions and ensure that the count variable is updated correctly.
    // However, it can also lead to performance issues if there are many threads
    // trying to access the method, as they will have to wait for each other to
    // finish before they can access it.

    // so we ignore the parallelism to prevent the race condition and ensure that
    // the count variable is updated correctly.
    public synchronized static void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}
