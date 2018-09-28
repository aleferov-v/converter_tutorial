package com.company;


/**
 * Created by li1-gi on 18.09.2018.
 */
public class Demo1 {
    public static void main(String[] args) {
        // Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6

        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = ((int)(Math.random()*100));
//            System.out.println(arr[i]);
            if (arr[i] % 3 == 0 && arr[i] % 6 == 0)
                    System.out.println ("Числа, которые делятся на 3 и на 6: " + arr[i]);
                }}
        }


