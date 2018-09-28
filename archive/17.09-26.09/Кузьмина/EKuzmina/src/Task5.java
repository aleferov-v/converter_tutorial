import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int a = input.nextInt(); // размерность массива
        System.out.println("Введите массив");
        int array[] = new int[a]; // массив чисел кратный размерности

        for (int i = 0; i < a; i++) {
            array[i] = input.nextInt();
        }

        int max = array[0];

        System.out.println("Максимальное число массива равно");
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
            max = array[i];
        }
        System.out.println(max + " ");
    }
}
