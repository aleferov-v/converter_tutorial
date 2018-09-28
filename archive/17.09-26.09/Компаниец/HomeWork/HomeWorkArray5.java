import util.HomeWorkUtil;
import java.util.Arrays;

/**
 * Homework #5: Find a max element of an array with given size
 */
public class HomeWorkArray5 {
    public static void main(String[] args) {

        //Ask user for array size
        int arrSize = HomeWorkUtil.getIntegerFromUserInput();
        int[] intArray = new int[arrSize];

        //Fill array
        HomeWorkUtil.fillArrayWithRandomIntegers(intArray);
        System.out.println("Generated array is: " + Arrays.toString(intArray));

        //Get max element of array
        int indexOfMax = HomeWorkUtil.getIndexOfMaxArrayValue(intArray);
        System.out.println("Max array element is: array[" +  indexOfMax + "]=" + intArray[indexOfMax]);
    }
}
