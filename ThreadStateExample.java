class ThreadStateExample extends Thread {

    public void run() {
        try {
            System.out.println("Thread is RUNNING");

            Thread.sleep(1000); // TIMED_WAITING

            System.out.println("Thread is running again");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {

        ThreadStateExample t = new ThreadStateExample();

        // NEW state
        System.out.println("After creating thread: " + t.getState());

        t.start();

        // RUNNABLE state
        System.out.println("After start(): " + t.getState());

        Thread.sleep(200);

        // TIMED_WAITING state
        System.out.println("While sleeping: " + t.getState());

        t.join();

        // TERMINATED state
        System.out.println("After completion: " + t.getState());
    }
}