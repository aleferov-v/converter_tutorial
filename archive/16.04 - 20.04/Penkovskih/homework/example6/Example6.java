package com.company.example6;

import java.util.Arrays;

public class Example6 {


    public static void main(String[] args) {
        int[] arr = {4, -5, 0, 6, 8};
        int idMin = 0;
        int idMax = 0;
        int max = 0;
        int min = 0;


        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idMax = i;
            } else if (min > arr[i]) {
                min = arr[i];
                idMin = i;
            }

        }

        arrSwap(arr, idMin, idMax);
        System.out.println("SRC " + Arrays.toString(arr));
        System.out.println("Swap " + Arrays.toString(arrSwap(arr, min, max)));
    }

    private static int[] arrSwap(int[] arr, int min, int max) {
        int tempMinIndex = 0;
        int tempMaxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                tempMinIndex = i;
            } else if (arr[i] == max) {
                tempMaxIndex = i;
            }
        }
        arr[tempMinIndex] = max;
        arr[tempMaxIndex] = min;
        return arr;
    }

}
