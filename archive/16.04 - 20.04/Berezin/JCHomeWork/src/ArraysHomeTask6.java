
import java.util.Arrays;

public class ArraysHomeTask6 {
    public static void main(String[] args) {
        int[] intArray = {24, 6, 7, 8, 10, 15, 30, 21, 12};
        maxMinExchange(intArray);
    }
    public static void maxMinExchange (int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i=1; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int m=-1;
        int n=-1;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == max) {
                m = i;
                if (n>=0 && m>=0) {
                    break;
                }
                else {
                    continue;
                }
            }
            if (arr[i] == min) {
                n = i;
                if (n>=0 && m>=0) {
                    break;
                }
                else {
                    continue;
                }
            }
        }
        System.out.println("The old array: " + Arrays.toString(arr));
        arr[m] = min;
        arr[n] = max;
        System.out.println("The new array: " + Arrays.toString(arr));
    }
}


