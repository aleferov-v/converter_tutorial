package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionDemoQueue {
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayBlockingQueue<String>(5);
        queue1.offer("One");
        queue1.offer("Two");
        queue1.offer("Three");
        queue1.offer("Four");
        queue1.offer("Five");

        System.out.println(queue1);
        System.out.println("poll: " + queue1.poll());
        System.out.println(queue1);
        System.out.println("element: " + queue1.element());
        System.out.println(queue1);
        System.out.println("peek: " + queue1.peek());
        System.out.println(queue1);
        System.out.println("poll: " + queue1.poll());
        System.out.println(queue1);
    }
}
