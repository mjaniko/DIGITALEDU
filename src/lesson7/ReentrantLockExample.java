package lesson7;

/**
 * ReentrantLock, Lock
 * მაგალით
 */
public class ReentrantLockExample {

    static class MovementThread implements Runnable {

        private Countdown innerTimer;

        public MovementThread(Countdown timer) {
            this.innerTimer = timer;
        }

        @Override
        public void run() {
            this.innerTimer.doCountDownReentrant();
        }
    }

    static class HealingThread implements Runnable {

        private Countdown innerTimer;

        public HealingThread(Countdown timer) {
            this.innerTimer = timer;
        }

        @Override
        public void run() {
            this.innerTimer.doCountDownReentrant();
        }
    }


    public static void main(String[] args) {

        Countdown countdown = new Countdown();

        Thread threadImpl = new Thread(new MovementThread(countdown));
        threadImpl.setName("Thread 1");

        Thread healingThread = new Thread(new HealingThread(countdown));
        healingThread.setName("Thread 2");


        threadImpl.start();
        healingThread.start();
    }

}
