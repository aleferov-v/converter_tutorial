import java.util.Arrays;
//Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
public class Odd {

    public static void main(String[] args) {
        int a = 10;
        int arr[] = new int[a];
        for (int i = 0; i < a; i++){
            arr[i] = i * 2 + 1;
        }
        System.out.println("Заполненный массив, содержащий 10 первых нечетных чисел:");
        System.out.println(Arrays.toString(arr));

    }
}
