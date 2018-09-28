package Labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sbt-botova-nn on 04.06.2018.
 * Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
 */
public class Array4 {
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

        int min = intArray[0];
        int k = 0;
        for (int i = 0; i < intArray.length; i++){

            if (intArray[i] < min){
                min = intArray[i];
        }

    }
        for (int j = 0; j < intArray.length; j++){
            if (intArray[j] == min){
                k++;
            }
        }
        System.out.println("Минимальный элемент: " + min + " встречается раз: " + k);
    }
}