package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionDemoDeque {
    public static void main(String[] args) {
        Deque<String> queue1 = new ArrayDeque<>();
        queue1.offer("One");
        System.out.println(queue1);
        queue1.offer("Two");
        System.out.println(queue1);
        queue1.addFirst("Three");
        System.out.println(queue1);
        queue1.addFirst("Four");
        System.out.println(queue1);
        queue1.addLast("Five");
        System.out.println(queue1);


    }
}
