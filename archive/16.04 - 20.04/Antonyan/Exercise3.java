// Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.


package Exercise;

import java.util.Arrays;

public class Exercise3 {
    public static void main (String[] args) {
        int intArray[] = new int[10];

        for (int i=0;i<intArray.length;i++) {
            intArray[i]=2*i+1;
        }



        System.out.println(Arrays.toString(intArray));

    }

}

