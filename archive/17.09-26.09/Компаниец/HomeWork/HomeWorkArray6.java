import util.HomeWorkUtil;
import java.util.Arrays;

/**
 * Homework #6: Find and swap min and max elements of array
 */
public class HomeWorkArray6 {
    public static void main(String[] args) {

        //Ask user for array size
        int arrSize = HomeWorkUtil.getIntegerFromUserInput();
        int[] intArray = new int[arrSize];

        //Fill array
        HomeWorkUtil.fillArrayWithRandomIntegers(intArray);
        System.out.println("Generated array is: " + Arrays.toString(intArray));

        //Get min and max elements of array
        int indexOfMin = HomeWorkUtil.getIndexOfMinArrayValue(intArray);
        int indexOfMax = HomeWorkUtil.getIndexOfMaxArrayValue(intArray);

        //Swap min and max elements
        int temp = intArray[indexOfMin];
        intArray[indexOfMin] = intArray[indexOfMax];
        intArray[indexOfMax] = temp;

        System.out.println("Modified array is: " + Arrays.toString(intArray));
    }
}
