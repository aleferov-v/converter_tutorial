import util.HomeWorkUtil;
import java.util.Arrays;

/**
 * Homework #4: Find min elements of an array with given size
 */
public class HomeWorkArray4 {
    public static void main(String[] args) {

        //Ask user for array size
        int arrSize = HomeWorkUtil.getIntegerFromUserInput();
        int[] intArray = new int[arrSize];

        //Fill array
        HomeWorkUtil.fillArrayWithRandomIntegers(intArray);
        System.out.println("Generated array is: " + Arrays.toString(intArray));

        //Get first min element of array
        int indexOfMin = HomeWorkUtil.getIndexOfMinArrayValue(intArray);
        System.out.println("First min array element is: array[" +  indexOfMin + "]=" + intArray[indexOfMin]);

        //Find all next min elements of array
        for (int i=indexOfMin+1; i < intArray.length; i++) {
            if (intArray[i] == intArray[indexOfMin]) {
                System.out.println("Other min array element is: array[" +  i + "]=" + intArray[i]);
            }
        }
    }
}
