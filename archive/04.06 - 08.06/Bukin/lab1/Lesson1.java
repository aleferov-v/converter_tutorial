/**
*JavaBasic. Lesson 1. Example of homework
*
*@autor Andrey Bukin
*@version dated 04.06 2018
*/

import java.util.Arrays;
import java.util.Scanner;

class Lesson1{
    public static void main(String[]args){
        selection();
    }
    
    static void selection() {
        System.out.println();
        System.out.println("Введите номер задания от 1 до 4 (задания 4, 5, и 6 объеденины): ");
        Scanner scanner = new Scanner (System.in);
        int userNumber = scanner.nextInt();
        switch (userNumber){
            case 1:
                integersArray ();
                break;
            case 2:
                averageAmountArray();
                break;
            case 3:
                theList();
                break;
            case 4:
                minMaxArrey();
                break;
        }
        
    }
    
    static void replay() {
        System.out.println("Хотите продолжить проверку? (1 - ДА, любое другое число - НЕТ)");
        Scanner replay = new Scanner(System.in);
        int c = replay.nextInt();
        if (c == 1) {
            selection();
        }
    }
    
    
    
    /**
    * 1. Дан массив целых чисел, найти среди элементов массива числа, 
    *    которые делятся на 3 и на 6
    */
    
    static void integersArray(){
        int [] arr = {1,2,6,9,10,17,18,19,21,24};
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]%3 ==0 && arr[i]%6 ==0) {
                System.out.print(arr[i] + " ");
            }    
        }
        System.out.println();  
        System.out.println();          
        replay();
    } 
    
    /**
    * 2. Посчитать среднее арифметическое чисел в массиве 
    */
    
    static void averageAmountArray() {
        int [] arr = {2,4,5,6,10,13};
        //int count = arr.length();
        double summ = 0;
        double averageSumm=0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        averageSumm = summ/arr.length;
        System.out.println();
        System.out.println("Среднее арифмитическое массива = " + averageSumm);
        System.out.println();
        replay();
    }
        
    /**
    * 3. Создайте массив, содержащий 10 первых нечетных чисел. 
    *    Выведете элементы массива на консоль в одну строку, разделяя запятой.
    */


    static void theList() {
        int [] arr = new int[10];
        int step = 1;
        for (int i = 0; i < arr.length;i++) {
            arr[i] = 0 + step; 
            step += 2;
            if (i == (arr.length-1)) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");    
            }
        }
        System.out.println();
        System.out.println();
        replay();
    }
    
    /**
    * 4. Дан массив размерности N, найти наименьший элемент массива и вывести 
    *    на консоль (если наименьших элементов несколько — вывести их все).
    * 5. Найти наибольший элемент в массиве.
    * 6. Поменять наибольший и наименьший элементы массива местами. 
    *    Пример: дан массив {4, -5, 0, 6, 8}.  После замены будет выглядеть {4, 8, 0, 6, -5}.
    */
    
    public static void minMaxArrey() {
        int[] arr = {1,5,3,-8,15,-19,20,65};
        int min = arr[0];
        int max = arr[0];
        int numMin = 0;
        int numMax = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (min > arr[i]) {
                min = arr [i];
                numMin = i;
            }           
        }
        for (int j = 0; j < arr.length; j ++) {
            if (max < arr[j]) {
                max = arr [j];
                numMax = j;
            }
        }   
        System.out.println();
        System.out.println("Минимальное значение в массиве = " + min);
        System.out.println("Максимальное значение в массиве = " + max);
        System.out.println();
        System.out.println(Arrays.toString(arr));
        arr[numMin] = max;
        arr[numMax] = min;
        System.out.println(Arrays.toString(arr)); 
        System.out.println();
        replay();
    }  
}

        
  