package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by sbt-spirenkov-av on 18.09.2018.
 *
 * Посчитать среднее арифметическое чисел в массиве
 *
 */
public class Task_2 {


    public static void main(String[] args) {

        System.out.println("Задание: 2 \n\t Посчитать среднее арифметическое чисел в массиве");
        System.out.println("-----------------------------");


        //читаем из консоли
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько будет элементов в массиве? (введите число)>");
        String strCountElementInArray = in.nextLine();

        //Преобразуем строку в число
        int intCountElementInArray = Integer.parseInt(strCountElementInArray);

        System.out.println("Ок. будем работать с " + intCountElementInArray + " элементами");

        //создаем массив
        int[] arrayNumber = new int[intCountElementInArray];

        //Заполнение массива

        //Создаем генератор случайных чисел
        Random randomGenerator = new Random();

        //Заполняем массив
        for (int icurr = 0; icurr < intCountElementInArray; icurr++) {
            arrayNumber[icurr] = randomGenerator.nextInt(100)-50;
        }

        System.out.println("Массив заполнен, готовы начать задание");
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arrayNumber));

        System.out.println("Решение:");
        long sumArray=0;

        //Считаем сумму всех элементов
        for (int icurr = 0; icurr < intCountElementInArray; icurr++) {
            sumArray += arrayNumber[icurr];
        }
        //считаем средне арифметическое
        float duubAVERG=(float)sumArray/(float)intCountElementInArray;
        //вывод результата
        System.out.println("Сумма "+ sumArray+" элементов "+intCountElementInArray);
        System.out.printf("Среднее арифметическое: [%5.2f]",duubAVERG);

        System.out.println("\nTask complete!");
    }


}
