package util;

import java.util.Scanner;

/**
 * Utils class
 */
public class HomeWorkUtil {
    /**
     * Fill an array with random integers in range from 0 to 100
     * @param intArray
     */
    public static void fillArrayWithRandomIntegers(int[] intArray) {
        for (int i=0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
    }

    /**
     * Calculate an average value of an array elements
     * @param intArray
     * @return double Average
     */
    public static float calcAverageOfArrayValues(int[] intArray) {
        int sum = 0;
        for (int item: intArray) sum+=item;
        return (intArray.length != 0) ? (float) sum / intArray.length : 0;
    }

    /**
     * Get an integer value from user input
     * @return int Value
     */
    public static int getIntegerFromUserInput() {
        int intValue=1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an array size (integer value):");

        //Checking user input for an positive integer value
        if (scan.hasNextInt()) {
            intValue = scan.nextInt();
            if (intValue < 1) {
                System.out.println("Wrong input, please enter an positive integer value!");
                System.exit(1);
            }
            System.out.println("Given array size is: " + intValue);
        } else {
            System.out.println("Wrong input, please enter an positive integer value!");
            System.exit(1);
        }
        return intValue;
    }

    /**
     * Get an index of array min element
     * @param intArray
     * @return int indexOfMin
     */
    public static int getIndexOfMinArrayValue(int[] intArray) {
        int indexOfMin=0;
        for(int i=1; i < intArray.length; i++) {
            if (intArray[i] < intArray[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    /**
     * Get an index of array max element
     * @param intArray
     * @return int indexOfMax
     */
    public static int getIndexOfMaxArrayValue (int[] intArray) {
        int indexOfMax=0;
        for(int i=1; i < intArray.length; i++) {
            if (intArray[i] > intArray[indexOfMax]) {
                    indexOfMax = i;
            }
        }
        return indexOfMax;
    }

}
