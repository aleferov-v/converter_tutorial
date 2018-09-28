package collections;

import java.util.*;

public class CollectionDemoLinkedHashMap {
    public static void main(String[] args) {
        Map<Student, String> map1 = new TreeMap<>();
        map1.put(new Student("John", 20), "18-18");
        map1.put(new Student("Bill", 30), "20-11");
        map1.put(new Student("Fred", 47), "26-15");
        map1.put(new Student("Slava", 15), "11-22");
        map1.put(new Student("Dima", 79), "41-04");

        map1.forEach((key, value) -> {
            System.out.println(key + " [" + value + "]");
        });
    }
}

class Student implements Comparable {

    String name;
    int age;
    static int count = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("compare>> " + count++);
        Student object = (Student) o;
        if (age == object.age) {
            return 0;
        } else if (age > object.age) {
            return 1;
        }
        return -1;
    }
}
