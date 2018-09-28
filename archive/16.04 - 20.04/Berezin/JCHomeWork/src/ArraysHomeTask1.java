import java.util.Arrays;

public class ArraysHomeTask1 {
    public static void main(String[] args) {
        int[] intArray = {24,6,7,8,10,15,30};
        for (int arrayElement: intArray) {
            if (arrayElement%3 == 0 && arrayElement%6 == 0) {
                System.out.println(arrayElement);
            }
        }
    }
}
