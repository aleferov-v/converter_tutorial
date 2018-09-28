package Labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sbt-botova-nn on 04.06.2018.
 * Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.  После замены будет выглядеть {4, 8, 0, 6, -5}.
 */
public class Array6 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};

        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] < min) {
                min = intArray[i];
            }
        }

        int indexMin = Arrays.asList(intArray).indexOf(min);
        System.out.println("Минимальный элемент: " + min + " с индексом " + indexMin);

        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        int indexMax = Arrays.asList(intArray).indexOf(max);
        System.out.println("Максимальный элемент: " + max + " с индексом " + indexMax);

        intArray[indexMin] = max;
        intArray[indexMax] = min;

        System.out.println("Массив: ");
        System.out.println(Arrays.toString(intArray));

    }

}
