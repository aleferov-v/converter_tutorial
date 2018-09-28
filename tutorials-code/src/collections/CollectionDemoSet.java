package collections;

import java.util.*;

public class CollectionDemoSet {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        System.out.println(set1.add("Three"));
        System.out.println(set1.add("Two"));
        System.out.println(set1.add("One"));
        System.out.println(set1.add("Three"));
        System.out.println(set1.add("Three1"));
        System.out.println(set1.add("Three3"));
        System.out.println(set1);
    }
}

