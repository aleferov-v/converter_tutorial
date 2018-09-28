
import java.util.Arrays;
import java.util.Scanner;

//Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6
public class Div3_6 {
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
            if (arr[i]%3 == 0 && arr[i]%6 == 0){
                answer[count] = arr[i];
                count++;
            }
        }
        System.out.println("Заполненный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Элементы массива, которые делятся на 3 и на 6:");
        if (count == 0) {
            System.out.println("Нет таких элементов");
        } else {
            for (int i = 0; i < count; i++){
                System.out.println(answer[i]);
            }
        }
        //System.out.println(Arrays.toString(answer));

    }
}
