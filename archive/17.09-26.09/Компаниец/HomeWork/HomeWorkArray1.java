import util.HomeWorkUtil;
import java.util.Arrays;

/**
 * Homework #1: Find array elements divided by 3 and 6 at the same time
 */
public class HomeWorkArray1 {
    public static void main(String[] args) {

        int[] intArray = new int[20];

        //Fill array
        HomeWorkUtil.fillArrayWithRandomIntegers(intArray);
        System.out.println("Generated array is: " + Arrays.toString(intArray));

        //Search for array elements divided by 3 AND 6
        for (int item: intArray) {
            if (item % 6 == 0) System.out.println("Element is divided by 6 (and 3 too): " + item);
        }
    }
}

