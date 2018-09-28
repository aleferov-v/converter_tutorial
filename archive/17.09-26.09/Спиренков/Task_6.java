package com.company;

import java.util.Arrays;

/**
 * Created by sbt-spirenkov-av on 18.09.2018.
 */
public class Task_6 {

    public static void main(String[] args) {

        //Задание
        System.out.println("Задание: 6 \n\t Поменять наибольший и наименьший элементы массива местами.\n" +
                "Пример: дан массив {4, -5, 0, 6, 8}.\n" +
                "После замены будет выглядеть {4, 8, 0, 6, -5}.\n");
        System.out.println("-----------------------------");

        System.out.println("Решение:");

        //Объявляем массив
        int[] array = new int[]{4, -5, 0, 6, 8};
        //инициализируем переменные обмена
        int max = -100, min = 100;
        int maxP = -1, minP = -1;
        //проходим весь массив и находим min и max
        for (int icurr = 0; icurr < 5; icurr++) {
            if (array[icurr] < min) {
                //Запоминаем мин значение
                min=array[icurr];
                minP = icurr;
            }
            if (array[icurr] > max) {
                //запоминаем max значение
                max = array[icurr];
                maxP=icurr;
            }

        }
        //меняем местами
            array[maxP]=min;
            array[minP]=max;

        //вывод на экран
        System.out.println(Arrays.toString(array));
    }
}
