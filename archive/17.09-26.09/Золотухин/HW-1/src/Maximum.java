import java.util.Arrays;
import java.util.Scanner;

//Найти наибольший элемент в массиве
public class Maximum {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int count = 0;
        int arr[] = new int[a];
        for (int i = 0; i < a; i++){
            arr[i] = (int) Math.floor(100 - Math.random() * 200);
        }
        int max = arr [0];
        for (int i = 1; i < a; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Заполненный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Наибольший элемент массива: " + max);
    }
}
