package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemoSort {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(4,2,6,7,3,8,9));
        Collections.sort(list1);
        System.out.println(list1);
    }
}
