package com.company.example2;

import java.util.Arrays;

public class Example2 {


    public static void main(String[] args) {
        int summ = 0;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        System.out.println("Сумма всех элементов массива [" + summ + "]");
        summ = summ / arr.length;
        System.out.println("Ср. арифметическое [" + summ + "]");
    }
}
