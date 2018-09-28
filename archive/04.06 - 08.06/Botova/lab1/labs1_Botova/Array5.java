package Labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sbt-botova-nn on 04.06.2018.
 * Найти наибольший элемент в массиве.
 */
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n= sc.nextInt();

        int[] intArray = new int[n];
        for (int i = 0; i < intArray.length; i++) {
            double randNum =  Math.random();
            intArray[i] = (int) (randNum*100);
        }

        System.out.println("Массив: ");
        System.out.println(Arrays.toString(intArray));

        int max = intArray[0];

        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("Максимальный элемент: " + max );
    }

}

