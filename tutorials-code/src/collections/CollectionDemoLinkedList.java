package collections;

import java.util.*;

public class CollectionDemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
    }
}
