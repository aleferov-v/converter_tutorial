package com.company.example4;

import java.util.Arrays;

public class Example4 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = {10, 4, 25, 6, 45, 3, 13, 6, 8, 3, 3, 3, 3};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int temp = 0;
        for (int i = 0; i < arr2.length; i++) {


            if (arr2[i] < arr2[0]) {
                temp = arr2[i];

            }
        }
        System.out.println("перебором через for " + temp);

        Arrays.sort(arr2);
        int min = 0;
        System.out.print("Arrays.sort: [");
        for (int i = 0; i < arr2.length; i++) {
            min = arr2[0];
            if (min == arr2[i]) {
                System.out.print(" " + min + " ");
            }
        }
        System.out.println("]");


    }
}

