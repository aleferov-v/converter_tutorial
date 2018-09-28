package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionDemoArrayList1 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 6; i <= 10; i++) {
            list2.add(i);
        }
        System.out.println(list1);
        list1.addAll(list2);
        System.out.println(list1);
    }

}
