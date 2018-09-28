
import java.util.Arrays;

public class ArraysHomeTask5 {
    public static void main(String[] args) {
        int[] intArray = {24, 6, 7, 8, 10, 15, 30, 6, 8};
        getMaximalOfArray(intArray);
    }
    public static void getMaximalOfArray (int[] arr) {
        int max = arr[0];
        for (int i=1; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximal element is " + max);
    }
}
