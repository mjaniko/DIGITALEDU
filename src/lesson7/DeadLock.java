package lesson7;

public class DeadLock {

    public static void main(String[] args) {
        final String resource1 = "Resource One";
        final String resource2 = "Resource Two";

        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1: Doing some Count operation");
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");


                    for (int i = 0; i < 10; i++) {
                        System.out.println("Thread 2: Doing some Count operation");
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }

            }
        });

        t1.start();
        t2.start();

        Countdown counter = new Countdown();
        Thread healingThread = new Thread(new SynchronisedExamaple.HealingThread(counter));
        healingThread.start();

    }
}