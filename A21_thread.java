public class A21_thread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("===== MAIN THREAD STARTED =====");

        // Current Thread
        System.out.println("Current Thread : " + Thread.currentThread().getName());

        // ==========================
        // 1. Extending Thread
        MyThread t1 = new MyThread();

        // ==========================
        // 2. Runnable Object - itself is NOT a thread, but it can be passed to a Thread object to create a new thread
        Runnable t2 = new MyRunnable();

        // Runnable itself is NOT a thread
        // t2.run(); // runs in main thread

        Thread t3 = new Thread(t2);

        // ==========================
        // 3. Lambda Runnable
        // ==========================
        Thread t4 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {

                System.out.println(Thread.currentThread().getName() + " Lambda : " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // ==========================
        // 4. Naming Threads - Thread names are useful for debugging and logging purposes, as they help identify which thread is executing a particular piece of code. By default, threads are assigned names like "Thread-0", "Thread-1", etc., but you can set custom names to make it easier to understand the flow of your program.
        // ==========================
        t1.setName("Worker-1");
        t3.setName("Worker-2");
        t4.setName("Worker-3");

        // ==========================
        // 5. Priority - Thread priority is a hint to the thread scheduler about the relative importance of a thread. It can influence the order in which threads are scheduled for execution, but it does not guarantee that higher-priority threads will always run before lower-priority ones. The actual behavior may vary depending on the underlying operating system and its scheduling policies.
        // ==========================
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t3.setPriority(Thread.NORM_PRIORITY); // 5
        t4.setPriority(Thread.MIN_PRIORITY); // 1

        System.out.println(t1.getName() + " Priority : " + t1.getPriority());

        System.out.println(t3.getName() + " Priority : " + t3.getPriority());

        // ==========================
        // 6. Daemon Thread
        // ==========================
        DaemonTask daemon = new DaemonTask();
        daemon.setDaemon(true);
        daemon.start();

        // ==========================
        // 7. Thread State
        // ==========================
        System.out.println("Before Start : " + t1.getState());

        // ==========================
        // 8. start()
        // ==========================
        t1.start();
        t3.start();
        t4.start();

        System.out.println("After Start : " + t1.getState());

        // ==========================
        // 9. join()
        // ==========================
        t1.join();
        t3.join();
        t4.join();

        // ==========================
        // 10. Synchronization
        // ==========================
        Counter counter = new Counter();

        Thread s1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread s2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        s1.start();
        s2.start();

        s1.join();
        s2.join();

        System.out.println("Counter Value : " + counter.getCount());

        // ==========================
        // 11. isAlive()
        // ==========================
        System.out.println("t1 Alive : " + t1.isAlive());

        // ==========================
        // 12. Final State
        // ==========================
        System.out.println("t1 State : " + t1.getState());

        System.out.println("===== MAIN THREAD ENDED =====");
    }
}

// ==========================
// THREAD CLASS
// ==========================
class MyThread extends Thread {

    @Override
    public void run() { // Every thread has its own run() method, which is executed when the thread is
        // started

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(1000); // sleep() method is used to pause the execution of the current thread for a specified time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// ==========================
// RUNNABLE - it is a functional interface, which means it has only one abstract
// method, run(). It can be implemented using a lambda expression or an
// anonymous class. Runnable is used to define the task that a thread will
// execute. It is often used when you want to separate the task from the thread
// itself, allowing for more flexibility and reusability of the code.
// ==========================
class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " : " + i);

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// ==========================
// DAEMON THREAD
// ==========================
class DaemonTask extends Thread {

    @Override
    public void run() {

        while (true) {

            System.out.println(
                    "Daemon Running...");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// ==========================
// SYNCHRONIZATION - it is used to control access to shared resources by
// multiple threads
// e.g., when multiple threads are trying to access a shared resource, it can
// lead to data inconsistency or unexpected behavior. Synchronization ensures
// that only one thread can access the shared resource at a
// ==========================
class Counter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}