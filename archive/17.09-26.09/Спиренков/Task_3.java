package com.company;

import java.util.Arrays;

/**
 * Created by sbt-spirenkov-av on 18.09.2018.
 */
public class Task_3 {

    public static void main(String[] args) {

        //Задание
        System.out.println("Задание: 3 \n\t Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой");
        System.out.println("-----------------------------");

        System.out.println("Решение:");

        //Счетчик кол-ва найденых нечетных чисел
        int countOddNumber=0;
        //счетчик чисел из которых будут браться нечетные
        int currNumber=0;
        //результирующий массив
        int[] arrayOddNumber = new int[10];

        //Выполняем цикл, пока весь массив не будет заполнен
        while (countOddNumber<10)
        {
            //Проверка на нечетность
            if (currNumber%2!=0) {
            //Найдено нечетное число, сохраняем его в массив
                arrayOddNumber[countOddNumber] = currNumber;
                //увеличиваем счетчик найденых нечетных чисел на 1
                countOddNumber++;

            }
            //Увеличиваем счетчик просто чисел на 1
            currNumber++;
        }

        //выводим получившийся массив
        System.out.println("вывод функцией toString()");
        System.out.println(Arrays.toString(arrayOddNumber));
        //Выводим массив в нужном формате

        System.out.println("Вывод согласно заданию");
        for (int icurr=0;icurr<10;icurr++)
        {
            System.out.print(arrayOddNumber[icurr]);

            if (icurr!=9)
                System.out.print(",");

        }

        System.out.println("\nTask complete!");
    }
}
