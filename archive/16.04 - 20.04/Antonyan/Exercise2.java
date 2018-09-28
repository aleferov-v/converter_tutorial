// Посчитать среднее арифметическое чисел в массиве

package Exercise;

import java.util.Arrays;

public class Exercise2 {
    public static void main (String[] args) {
        int intArray[] = new int[15];

        int j = 0; // количество чисел
        int sum = 0; // сумма чисел массива

        // заполняем массив, считаем количество чисел
        for (int i=0; i< intArray.length; i++) {
            intArray[i] = i*2;
            j = j+1;
        }

        System.out.println(Arrays.toString(intArray));

        // считаем сумму чисел в массиве

        for (int i=0; i< intArray.length;i++) {
            sum += intArray[i];
        }


        // печатаем среднее арифметическое
        System.out.println(sum/j);
    }
}
