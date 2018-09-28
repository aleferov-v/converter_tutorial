import java.util.Arrays;

public class ArraysHomeTask2 {
    public static void main(String[] args) {
        int[] intArray = {24,6,7,8,10,15,30};
        int sum=0;
        for (int arrayElement: intArray) {
            sum+=arrayElement;
        }
        float average = (float)sum/intArray.length;
        System.out.println("Average is "+average);
    }
}
