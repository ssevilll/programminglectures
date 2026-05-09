public class Threading {
    public static void main(String[] args) throws InterruptedException {
        // There are two ways to create a thread in Java: by implementing the Runnable
        // interface or by extending the Thread class.

        // 1. Implementing the Runnable interface:
        Thread thread1 = new Thread(new RunClass());
        thread1.start();
        // The start() method is called to begin the execution of the thread.

        // 2. Extending the Thread class:
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        // The start() method is called to begin the execution of the thread.

        threadClass.isAlive();
        // returns true if the thread is still running, false otherwise.

        threadClass.sleep(100);
        // causes the currently executing thread to sleep for the specified number of
        // milliseconds. This can be used to pause the execution of a thread for a
        // certain amount of time, allowing other threads to execute or to create a
        // delay in the program's execution.

        threadClass.join();
        // waits for the thread to die. This can be used to ensure that a thread has
        // completed its execution before the program continues with the next steps.
        // When a thread calls the join() method on another thread, it will block until
        // the other thread has finished executing. This is useful for coordinating the
        // execution of multiple threads and ensuring that they complete in a specific
        // order.

        threadClass.interrupt();
        // interrupts the thread. This can be used to signal a thread to stop its
        // execution. When a thread is interrupted, it will throw an
        // InterruptedException if it is currently sleeping or waiting, or it will set
        // the interrupt flag if it is running. The thread can then check the interrupt
        // status and decide how to respond, such as by gracefully shutting down or by
        // performing cleanup operations before terminating.

        threadClass.yield();
        // requests that the currently executing thread be paused temporarily to allow
        // other threads to execute. This can be used to improve the responsiveness of a
        // program by allowing other threads to run while the current thread is waiting
        // for a resource or performing a long-running task. When a thread calls the
        // yield() method, it will pause its execution and allow other threads of the
        // same priority to run. However, there is no guarantee that the yielding thread
        // will immediately resume execution after yielding, as it depends on the
        // scheduling of the threads by the operating system.

        threadClass.getState();
        // returns the state of the thread. This can be used to check the current status
        // of a thread, such as whether it is running, waiting, or terminated. The
        // getState() method returns an enum value of type Thread.State, which can be
        // one of the following: NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, or
        // TERMINATED. By checking the state of a thread, you can make informed
        // decisions about how to manage its execution and coordinate it with other
        // threads in your program.
    }

}

class RunClass implements Runnable {
    public void run() {
        System.out.println("Hello from a run!");
    }
}

class ThreadClass extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
}