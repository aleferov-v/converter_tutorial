// Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6

package Exercise;

import java.util.Arrays;

public class Exercise1 {
    public static void main (String[] args) {
        int intArray[] = new int[15];

        // заполняем массив числами
        for (int i=0;i< intArray.length;i++) {
            intArray[i] = i*3;
        }

        // просто покажем, какие числа в массиве
    System.out.println(Arrays.toString(intArray));

        // проверяем, чтобы число делилось одновременно на 3 и 6
        // и печатаем такие числа через пробел
        for ( int j=1; j < intArray[14]; j++ ) {
            if (j%3 ==0) {
                if (j%6 == 0) {
                   System.out.print(j+" ");
                    }
                }
            }
        }
    }

