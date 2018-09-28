package JavaBasic.Lesson1;

/*
Поменять наибольший и наименьший элементы массива местами
{4,-5,0,6,8}
{4,8,0,6,-5}
 */

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        
        int[] mas = {4,-5,0,6,8} ;
        int min = 0;
        int max = 0;

        int[] mas2 = new int[mas.length];

        for (int i = 0; i <mas.length ; i++) {
            mas2[i] = mas[i];
        }

        Arrays.sort(mas2);
        int minElement = mas2[0];
        int maxElement = mas2[mas2.length-1];

        for (int i = 0; i <mas.length ; i++) {

            if (mas[i] == minElement )  {
                min = i;
            }
            else max = i;
       }
        mas[min] = maxElement;
        mas[max]= minElement;
        System.out.println(Arrays.toString(mas));

    }
}
