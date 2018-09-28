import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Изначальный массив");
        int[] array = {4, -5, 0, 6, 8};
        System.out.println(Arrays.toString(array));

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int newmin = 0, newmax = 0, result;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
               newmin = i;
            }
            if (array[i] > max) {
                max = array[i];
                newmax = i;
            }
        }

        result = array[newmin];
        array[newmin] = array[newmax];
        array[newmax] = result;

        System.out.println("min value = " + array[newmin]);
        System.out.println("max value = " + array[newmax]);

        System.out.println("Получившийся массив");
        System.out.println(Arrays.toString(array));

    }
}
