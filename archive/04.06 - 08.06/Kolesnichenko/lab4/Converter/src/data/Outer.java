package data;

import java.util.HashMap;
import java.util.Map;

public class Outer {

    public static void main(String[] args) {
        Outer2.printC();
    }

}

class Outer2 {
    static {
        c = 3;
    }

    public static int c;

    public static void printC() {
        System.out.println(c);
    }

}