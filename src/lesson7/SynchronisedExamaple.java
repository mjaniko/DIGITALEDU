package lesson7;


public class SynchronisedExamaple {

    static class MovementThread implements Runnable {

        private Countdown innerTimer;

        public MovementThread(Countdown timer) {
            this.innerTimer = timer;
        }

        @Override
        public void run() {
            this.innerTimer.doCountdown();

        }
    }

    static class HealingThread implements Runnable {

        private Countdown innerTimer;

        public HealingThread(Countdown timer) {
            this.innerTimer = timer;
        }

        @Override
        public void run() {
            this.innerTimer.doCountdown();
        }
    }

    public static void main(String[] args) {
        //Timer timerObj = new Timer();

        Countdown countdown = new Countdown();

        Thread threadImpl = new Thread(new MovementThread(countdown));
        threadImpl.setName("Thread 1");

        Thread healingThread = new Thread(new HealingThread(countdown));
        healingThread.setName("Thread 2");


        threadImpl.start();
        healingThread.start();
    }
}
