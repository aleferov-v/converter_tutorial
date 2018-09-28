import java.util.*;

public class MassivTrain {
    public static void main(String[] args) {

        int[] array = {1, 21, 232, 324, 34, 2, 1, 12, 3, 13, 1, 31, 3, 123, 123, 434, 5, 34, 534, 1, 3, 5, 6, 7, 9, 99, 67};
        int[] arrayResalt = new int[9];
        //деление на 3 и на 6
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) System.out.println(array[i] + "делится на 3");
            if (array[i] % 6 == 0) System.out.println(array[i] + "делится на 6");
        }
        //среднее арифметическое

        int sumAvegere = 0;
        for (int i = 0; i < array.length; i++) {
            sumAvegere = sumAvegere + array[i];
        }
        sumAvegere = sumAvegere / (array.length + 1);
        System.out.print(sumAvegere);

        //поиск нечётных элементов и вывод мервых 10
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayResalt[j] = array[i];
                j++;
            }

            if (j == 9) {
                break;
            }
        }

        for (int i = 0; i < arrayResalt.length; i++) {
            if (i == arrayResalt.length - 1) {
                System.out.print(arrayResalt[i]);
                break;
            }
            System.out.print(arrayResalt[i] + ",");
        }
        //поиск минимального элемента
        int[] Less = new int[1];
        Less[0] = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < Less[0]) {
                Less[0] = array[i];
            }
        }
        System.out.println();
        // вывод минимальных элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Less[0]) {
                System.out.println(i + "-" + array[i]);
            }
        }
        //поиск максимального элемента
        int[] Max = new int[1];
        Max[0] = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max[0]) {
                Max[0] = array[i];
            }
        }
        System.out.println("Максимальный элемент-" + Max[0]);
        System.out.println(Arrays.toString(array));

        //Замена наибольших элементов наименьшими и наоборот

        // Запомним минимальные элементы
        int[] LessElements = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Less[0]) {
                LessElements[k] = i;
                k++
                ;
            }
        }

        // Запомним максимальные элементы

        int[] MaxElements = new int[array.length];
        k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Max[0]) {
                MaxElements[k] = i;
                k++
                ;
            }
        }
        // заменяем
        k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == MaxElements[k]) {
                array[i] = Less[0];
                k++;
            }
        }
        k = 0;
        for (int i = 0; i < array.length; i++) {
                if (i == LessElements[k]) {
                    array[i] = Max[0];
                    k++;
                }
        }
        System.out.print(Arrays.toString(array));


        }
    }

