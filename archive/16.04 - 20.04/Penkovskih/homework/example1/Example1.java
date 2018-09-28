package com.company.example1;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        for (int j : arr) {
            if ((j % 3 == 0) && (j % 6) == 0) {
                System.out.println(j);
            }
        }

    }
}
