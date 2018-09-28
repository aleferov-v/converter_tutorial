package JavaBasic.Lesson1;

/*
Найти наибольший элемент в массиве
*/

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] mas = {3,2,1,5,1,4};

        Arrays.sort(mas);

        System.out.println(mas[mas.length-1]);

    }
}