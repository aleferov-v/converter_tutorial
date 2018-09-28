package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemoIndexOf {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(
                Arrays.asList("One", "Two", "Three", "Four", "Five"));
        int index = list1.indexOf("Three");
        System.out.println(list1.get(index));
        System.out.println(list1.indexOf("Zero"));
    }
}
