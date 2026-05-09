public class ThreadStates {
    public static void main(String[] args) throws Exception {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        });

        System.out.println(t.getState()); // NEW
        //start method has not been called yet, so the thread is in the NEW state.

        t.start();
        System.out.println(t.getState()); // RUNNABLE
        // The thread has been started and is now in the RUNNABLE state, meaning it is ready to run but may not be running yet.

        Thread.sleep(500);

        System.out.println(t.getState()); // TIMED_WAITING
        // The thread is currently sleeping with a specified time, so it is in the TIMED_WAITING state.

        t.join();

        System.out.println(t.getState()); // TERMINATED
        // The thread has completed its execution and is now in the TERMINATED state.
    }
}