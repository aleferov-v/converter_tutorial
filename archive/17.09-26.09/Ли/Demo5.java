package com.company;

import java.util.Arrays;
import java.util.OptionalInt;

public class Demo5 {

    public static void main(String[] args) {
        // write your code here
        // Найти наибольший элемент в массиве.

        int [] arr = new int[24];
        for (int i = 0; i < arr.length; i++){
            arr[i] = ((int)(Math.random()*31)-15);
           // System.out.println(arr[i]);
        }
        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max.getAsInt());
        System.out.println("Заданный массив:" + Arrays.toString(arr));


    }
}
