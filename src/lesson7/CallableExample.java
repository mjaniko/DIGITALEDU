package lesson7;

import java.util.concurrent.*;


/**
 * Callable Example
 */
public class CallableExample {


    static class HealingThread implements Callable<Integer> {

        Countdown timer;

        public HealingThread(Countdown timerStep) {
            this.timer = timerStep;
        }

        @Override
        public Integer call() {
            this.timer.doCountdown();
            return 1;
        }
    }


    public static void main(String[] args) {

        Countdown timer = new Countdown();

        Thread thread = new Thread(() -> {
            FutureTask<Integer> task = new FutureTask<>(new HealingThread(timer));
            task.run();
        });

        thread.start();

        FutureTask<Integer> task2 = new FutureTask<>(new HealingThread(timer));
        task2.run();
        if (task2.isDone()) {
            try {
                System.out.println(task2.get());
            } catch (InterruptedException e) {
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }

}
