package lesson6;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueManager {


    public static void main(String[] args) {
        Stack<String> LIFO_EXAMPLE = new Stack<>();
        LIFO_EXAMPLE.push("1 MISHO");
        LIFO_EXAMPLE.push("2 LEQSO");
        LIFO_EXAMPLE.push("3 GIO");
        LIFO_EXAMPLE.push("4 GIO");
        LIFO_EXAMPLE.push("5 NIKA");
        LIFO_EXAMPLE.push("5 ACHI");
        LIFO_EXAMPLE.push("6 MISHO");

        // სტეკიდან ამოტივტივება pop

        Queue<String> QUEUE_EXAMPLE = new PriorityQueue<>();
        QUEUE_EXAMPLE.add("1 MISHO");
        QUEUE_EXAMPLE.add("2 LEQSO");
        QUEUE_EXAMPLE.add("3 GIO");
        QUEUE_EXAMPLE.add("4 GIO");
        QUEUE_EXAMPLE.add("5 NIKA");
        QUEUE_EXAMPLE.add("5 ACHI");
        QUEUE_EXAMPLE.add("6 MISHO");
        // რიგირდან ამოტივტივებას poll()

        System.out.println("PAUSED");
    }
}
