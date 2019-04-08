package lesson6;

public class StackOverflowErrorExample {


    public static void recursiveLoop(int count) {
        System.out.println("Count: " + count);
        if (count == 0) {
            return;
        }
        try {
            Thread.sleep(10L);
            System.gc();
        } catch (Exception e){

        }
        recursiveLoop(++count);
    }

    public static void main(String[] args) {
        StackOverflowErrorExample.recursiveLoop(1);
    }
}
