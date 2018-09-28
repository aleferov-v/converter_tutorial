
import java.util.Arrays;

public class ArraysHomeTask4 {
    public static void main(String[] args) {
        int[] intArray = {24, 6, 7, 8, 10, 15, 30, 6, 8};
        printMinimalsOfArray(intArray);
     }
    public static void printMinimalsOfArray (int[] arr) {
        int min = arr[0];
        for (int i=1; i< arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int arrayElement: arr) {
            if (arrayElement == min) {
                System.out.println(arrayElement);
            }
        }
    }
}
