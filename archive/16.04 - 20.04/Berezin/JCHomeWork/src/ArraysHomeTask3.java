
import java.util.Arrays;

public class ArraysHomeTask3 {
    public static void main(String[] args) {
        int targetNumber = 10;
        printArrayAsString(getArrayOfOddNumbers(targetNumber));
    }
    public static int[] getArrayOfOddNumbers(int numberOfElements) {
        int[] oddArray = new int[numberOfElements];
        int k=0;
        int i=0;
        while(k<10) {
            i++;
            if (i%2 != 0) {
                oddArray[k] = i;
                k++;
            }
        }
        return oddArray;
    }
    public static void printArrayAsString(int[] arr) {
        int j=0;
        for (int arrayElement: arr) {
            j++;
            System.out.print(arrayElement);
            if(arr.length != j) {
                System.out.print(", ");
            }
        }
    }
}

