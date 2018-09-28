package com.company;

import java.io.Console;
import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by sbt-spirenkov-av on 18.09.2018.
 *
 * Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6
 */

public class Task_1 {

    public static void main(String[] args) {

        //Задание
        System.out.println("Задание: 1 \n\t Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6");
        System.out.println("-----------------------------");

        //читаем из консоли
        Scanner in =new Scanner(System.in);
        System.out.print("Сколько будет элементов в массиве? (введите число)>");
        String strCountElementInArray=in.nextLine();

        //Преобразуем строку в число
        int intCountElementInArray=Integer.parseInt(strCountElementInArray);

        System.out.println("Ок. будем работать с "+intCountElementInArray+" элементами");

        //создаем массив
        int[] arrayNumber= new int[intCountElementInArray];

        //Заполнение массива

        //Создаем генератор случайных чисел
        Random randomGenerator=new Random();

        //Заполняем массив
        for (int icurr=0;icurr<intCountElementInArray;icurr++)
        {
            arrayNumber[icurr]=randomGenerator.nextInt(100)-50;
        }

        System.out.println("Массив заполнен, готовы начать задание");
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arrayNumber));

        System.out.println("Решение:");
        System.out.println("\nНайдены следующи элементы:");

        //Проверяем условия деления на 3 и на 6
        for (int icurr=0;icurr<intCountElementInArray;icurr++) {
            if (arrayNumber[icurr] % 3 == 0) {
                System.out.println("Элемент " + icurr + " " + arrayNumber[icurr] + " делится на 3");
            }
            if (arrayNumber[icurr] % 6 == 0) {
                System.out.println("Элемент " + icurr + " " + arrayNumber[icurr] + " делится на 6");
            }
        }

        System.out.println("Task complete!");
    }

}
