package com.company;

/**
 * Created by li1-gi on 19.09.2018.
 */
public class Demo2 {
    public static void main(String[] args) {
// Посчитать среднее арифметическое чисел в массиве
        int [] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10));
            System.out.println(arr[i]);}
        double average = 0;
        if (arr.length > 0) {
            double sum = 0;

                for (int j = 0; j < arr.length; j++){
                    sum += arr[j];
                }
                average = sum / arr.length;
                System.out.println("Среднее арифметическое: " + average);
            }
        }

    }

