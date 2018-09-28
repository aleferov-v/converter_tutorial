import java.util.Arrays;
import java.util.Scanner;

//Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
public class Minimum {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int count = 0;
        int arr[] = new int[a];
        int answer[] = new int[a];
        for (int i = 0; i < a; i++){
            arr[i] = (int) Math.floor(100 - Math.random() * 200);
            //arr[i] = 5;
            answer [i] = arr[i];
            if (arr[i] < answer[0]){
                answer[0] = arr[i];
                count = 0;
            } else if (arr[i] == answer [0]){
                answer[count] = arr[i];
                count++;
            }
        }
        System.out.println("Заполненный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Наименьшие элементыв массива:");
        if (count == 0) {
            System.out.println(answer[0]);
        } else {
            for (int i = 0; i < count; i++){
                System.out.println(answer[i]);
            }
        }
    }
}
