package JavaBasic.Lesson1;

/*
Массив из 10 первых нечетных элементов
*/

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] mas = new int[20];

        int j=0;
        for (int i = 0; i <20 ; i++) {

            if(i%2==1)
            {
            mas[j] =i;
            j++;
            }

       }

      System.out.println(Arrays.toString(mas));
  }
}
