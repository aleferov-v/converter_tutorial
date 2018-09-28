import java.util.Arrays;
import java.util.Random;

public class Lab1 {
    //Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6
    public static void Task1(){
        System.out.println("Задание 1");
        int[] source=setRnd((byte)10);
        System.out.println(String.format("Исходный массив: %S",Arrays.toString(source)));
        String result="То, что делится на 3 и 6:\n";
        for (int i=0;i<source.length;i++){
            if (source[i] % 3.==0 && source[i] % 6.==0 ) {
                result+=String.format("Элемент %S. Значение %S\n",i,source[i]);
            }
        }
        System.out.println(result);
    }
    //Посчитать среднее арифметическое чисел в массиве
    public static void Task2(){
        System.out.println("Задание 2");
        int[] source=setRnd((byte)10);
        int result=0;
        for (int i=0;i<source.length;i++){
            result+=source[i];
        }
        System.out.println(String.format("Исходный массив: %S",Arrays.toString(source)));
        System.out.println("Среднее:"+(double) (result/source.length));
    }

    //Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
    public static void Task3(){
        System.out.println("Задание 3");
        int[] source=setRnd((byte)20);
        System.out.println(String.format("Исходный массив: %S",Arrays.toString(source)));
        System.out.println("10 первых нечетных:");
        int i=0;
        int j=0;
        int[] result=new int[10];
        while (i<source.length && j<10){
           if (source[i] % 2!=0){
               result[j]=source[i];
               j++;
           }
            i++;
        }
        int k=0;
        while(j>0 && k<j-1) {
            System.out.print(result[k]+", ");
            k++;
        }
        if (j-1>=0) System.out.println(result[j-1]);
    }
    //Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
    public static void Task4(){
        System.out.println("Задание 4");
        byte N=20;
        int[] source=setRnd(N);
        System.out.println(String.format("Исходный массив: %S",Arrays.toString(source)));
        int min=source[0];
        for (int i=1;i<source.length;i++){
            if (source[i]<=min){
                min=source[i];
            }
        }
        for (int i=0;i<source.length;i++){
            if (source[i]==min){
                System.out.println(source[i]);
            }
        }
    }

    //Найти наибольший элемент в массиве.
    public static void Task5(){
        System.out.println("Задание 5");
        byte N=20;
        int[] source=setRnd(N);
        System.out.println(String.format("Исходный массив: %S",Arrays.toString(source)));
        int max=source[0];
        for (int i=1;i<source.length;i++){
            if (source[i]>max){
                max=source[i];
            }
        }
        System.out.println("Максимальное: "+max);
    }

    //Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.  После замены будет выглядеть {4, 8, 0, 6, -5}.
    public static void Task6(){
        System.out.println("Задание 6");
        byte N=20;
        int[] source=setRnd(N);
        System.out.println(String.format("Исходный массив: %S",Arrays.toString(source)));
        int max=source[0];
        int min=source[0];
        int minIndex=0;
        int maxIndex=0;
        for (int i=1;i<source.length;i++){
            if (source[i]>max){
                max=source[i];
                maxIndex=i;
            }
            if (source[i]<min){
                min=source[i];
                minIndex=i;
            }
        }
        source[minIndex]=max;
        source[maxIndex]=min;
        System.out.println(String.format("Результат      : %S",Arrays.toString(source)));
    }

    static int[] setRnd(byte cnt){
        int[] source=new int[cnt];
        for (int i=0;i<source.length;i++){
            source[i] = new Random().nextInt(200);
        }
        return source;
    }
}
