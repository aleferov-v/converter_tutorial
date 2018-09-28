import util.HomeWorkUtil;
import java.util.Arrays;

/**
 * Homework #2: Calculate an average of array values
 */
public class HomeWorkArray2 {
    public static void main(String[] args) {

        int[] intArray = new int[20];

        //Fill array
        HomeWorkUtil.fillArrayWithRandomIntegers(intArray);
        System.out.println("Generated array is: " + Arrays.toString(intArray));

        //Calculate average of array values
        System.out.println("Average of the array values is: " + HomeWorkUtil.calcAverageOfArrayValues(intArray));
    }
}

