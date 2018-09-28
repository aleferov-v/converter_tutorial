package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemoTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        set1.add("Four");
        set1.add("Five");
        System.out.println(set1);

        System.out.println(set1.first());
        System.out.println(set1.last());
        System.out.println(set1.higher("Three"));
        System.out.println(set1.floor("Three"));
        System.out.println(set1.lower("Four"));
        System.out.println(set1.ceiling("Four"));
    }
}
