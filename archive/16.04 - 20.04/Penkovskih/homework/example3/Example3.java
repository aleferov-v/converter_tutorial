package com.company.example3;

import java.util.Arrays;

public class Example3 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int count = 1;
        for (int i = 0; i < 10; i++) {
            if (count % 2 != 0) {
                arr[i] = count;
                count += 2;
            }
        }
        System.out.println("SRC: " + Arrays.toString(arr));

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i == arr.length - 1) {
                builder.append("]");
            } else {
                builder.append(", ");
            }
        }
        System.out.println(builder);
    }
}
