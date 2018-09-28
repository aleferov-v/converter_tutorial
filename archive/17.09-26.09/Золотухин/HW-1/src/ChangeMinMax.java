import java.util.Arrays;
import java.util.Scanner;

//Поменять наибольший и наименьший элементы массива местами
public class ChangeMinMax {
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
        System.out.println("Заполненный массив:");
        System.out.println(Arrays.toString(arr));

        int max = arr [0];
        int min = arr [0];
        for (int i = 1; i < a; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        //System.out.println("max " + max);
        //System.out.println("min " + min);
        for (int i = 1; i < a; i++) {
            if (arr[i] == max) {
                arr[i] = min;
                continue;
            } else if (arr[i] == min) {
                arr[i] = max;
                continue;
            }

        }
        System.out.println("Измененный массив:");
        System.out.println(Arrays.toString(arr));
    }


}
