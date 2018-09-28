package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by sbt-spirenkov-av on 18.09.2018.
 */
public class Task_5 {
    public static void main(String[] args) {

        //Задание
        System.out.println("Задание: 5 \n\t Найти наибольший элемент в массиве");
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
            arrayNumber[icurr] = randomGenerator.nextInt(100) - 50;
        }

        System.out.println("Массив заполнен, готовы начать задание");
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arrayNumber));

        System.out.println("Решение:");

        //Перебираем все элементы массива ищем наименьший
        int max=-200;
        for (int icurr=0;icurr<intCountElementInArray;icurr++)
        {
            if (arrayNumber[icurr]>max)
            {
                max=arrayNumber[icurr];
            }
        }
        System.out.println("Найден Максимальный  элемент "+max);

    }
}
