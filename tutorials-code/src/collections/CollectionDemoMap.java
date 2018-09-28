package collections;

import java.util.*;

public class CollectionDemoMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Two");
        map1.put(4, "Four");
        map1.put(5, "Five");
        map1.put(1, "One");
        map1.put(3, "Three");

        System.out.println(map1);
    }
}
