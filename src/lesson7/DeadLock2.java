package lesson7;

import java.util.Random;

/**
 * DeadLock შემთხვევაში ხელით Force გამოღვიძება notifyAll ის საშუალებით
 */
public class DeadLock2 {

    public static void main(String[] args) {
        Message message = new Message();

        Thread writer = (new Thread(new Writer(message)));
        writer.setName("=Writer Thread=");
        writer.start();

        Thread reader = (new Thread(new Reader(message)));
        reader.setName("=Reader Thread=");
        reader.start();
    }

    static class Message {
        private String message;
        private boolean empty = true;

        public synchronized String read() {
            while (empty) {
                try {
                    notify();
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            empty = true;
            return message;
        }

        public synchronized void write(String message) {
            while (!empty) {
                try {
                    notify();
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            empty = false;
            this.message = message;
        }
    }

    static class Writer implements Runnable {
        private Message message;

        public Writer(Message message) {
            this.message = message;
        }

        public void run() {
            String messages[] = {
                "რაღაც კარგი ამინდია",
                "რასქვია კარგი ამინდია წვიმს გარეთ",
                "ეჰ რომ წვიმდეს და არ თოვდეს კარგი იქნებოდა",
                "არადა ბუხართან ჩაი მმმ...",
                "რაღაც კარგი ამინდია",
                "რასქვია კარგი ამინდია წვიმს გარეთ",
                "ეჰ რომ წვიმდეს და არ თოვდეს კარგი იქნებოდა",
                "არადა ბუხართან ჩაი მმმ...",
                "რაღაც კარგი ამინდია",
                "რასქვია კარგი ამინდია წვიმს გარეთ",
                "ეჰ რომ წვიმდეს და არ თოვდეს კარგი იქნებოდა",
                "არადა ბუხართან ჩაი მმმ...",
                "რაღაც კარგი ამინდია",
                "რასქვია კარგი ამინდია წვიმს გარეთ",
                "ეჰ რომ წვიმდეს და არ თოვდეს კარგი იქნებოდა",
                "არადა ბუხართან ჩაი მმმ...",
            };

            Random random = new Random();

            for (int i = 0; i < messages.length; i++) {
                message.write(messages[i]);
                try {
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                    System.out.println("LOCKED");
                }
            }
            message.write("Finished");
        }
    }

    static class Reader implements Runnable {
        private Message message;

        public Reader(Message message) {
            this.message = message;
        }

        public void run() {
            Random random = new Random();
            for (String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
                System.out.println(latestMessage);
                try {
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
