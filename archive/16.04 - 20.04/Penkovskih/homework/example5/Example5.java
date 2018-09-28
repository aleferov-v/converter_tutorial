package com.company.example5;

public class Example5 {

    public static void main(String[] args) {
        int[] arr = {10,3,15,4,1};
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
           if(max < arr[i])
            max =arr[i];
        }
        System.out.println(max);
    }
}
