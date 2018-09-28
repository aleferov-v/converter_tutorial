package Labs;

import java.util.Arrays;

/**
 * Created by sbt-botova-nn on 04.06.2018.
 * Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
 */
public class Array3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int arraylenght = 10;
        int[] intArray = new int[arraylenght];
        while (i < 10)
        {
            if (j % 2 != 0) {
                intArray[i] = j;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
