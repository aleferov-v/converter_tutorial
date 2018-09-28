import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = i * 2 + 1;
        }
        System.out.println("Элементы массива нечетных чисел" + Arrays.toString(intArray));
    }
}
