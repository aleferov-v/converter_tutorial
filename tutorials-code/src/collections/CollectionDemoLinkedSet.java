package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDemoLinkedSet {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        System.out.println(set1.add("Three"));
        System.out.println(set1.add("Two"));
        System.out.println(set1.add("One"));
        System.out.println(set1.add("Three"));
        System.out.println(set1);
    }
}
