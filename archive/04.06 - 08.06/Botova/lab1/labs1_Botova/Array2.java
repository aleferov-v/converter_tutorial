package Labs;

/**
 * Created by sbt-botova-nn on 04.06.2018.
 * Посчитать среднее арифметическое чисел в массиве
 */
public class Array2 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i <intArray.length; i++) {
            sum = sum + intArray[i];
        }
        double mean = sum/intArray.length;
        System.out.println("mean = " + mean);
    }
}
