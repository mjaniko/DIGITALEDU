package lesson7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Countdown {

    private Lock lockState = new ReentrantLock();

    private int i;

    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = AnsiColors.ANSI_CYAN;
                break;
            case "Thread 2":
                color = AnsiColors.ANSI_PURPLE;
                break;
            default:
                color = AnsiColors.ANSI_GREEN;
        }


        for (int j = 10; j > 0; j--) {
            //System.out.println(AnsiColors.ANSI_GREEN + Thread.currentThread().getName() + ": j = [ " + j + " ]");
        }


        // აქამდე ასინქრონულია
        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = [ " + i + " ]");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public void doCountDownReentrant() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = AnsiColors.ANSI_CYAN;
                break;
            case "Thread 2":
                color = AnsiColors.ANSI_PURPLE;
                break;
            default:
                color = AnsiColors.ANSI_GREEN;
        }


        boolean isLocked = lockState.tryLock();

        if (isLocked) {
            try {
                for (i = 10; i > 0; i--) {
                    System.out.println(color + Thread.currentThread().getName() + ": i = [ " + i + " ]");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            } finally {
                lockState.unlock();
                notify();
            }


        }
    }

}
