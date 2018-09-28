package Labs;

import java.util.Arrays;

/**
 * Created by sbt-botova-nn on 04.06.2018.
 * Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6
 */
public class Аrray1 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Делящиеся на 3 и 6 числа массива: ");

        for (int i = 0; i <intArray.length; i++) {
            if ((intArray[i]%3 == 0) || (intArray[i]%6 == 0) ){
                System.out.println(intArray[i]);
            }
        }
    }
}


