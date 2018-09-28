
import java.util.Arrays;
import java.util.Scanner;
//Посчитать среднее арифметическое чисел в массиве

public class Avg {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int arr[] = new int[a];
        int summ = 0;
        for (int i = 0; i < a; i++){
            arr[i] = (int) Math.floor(100 - Math.random() * 200);
            summ += arr[i];
        }
        System.out.println("Заполненный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("среднее арифметическое чисел в массиве: " + summ/a);

    }

}
