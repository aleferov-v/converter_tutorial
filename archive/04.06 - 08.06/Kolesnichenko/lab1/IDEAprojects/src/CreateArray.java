
import java.util.*;
public class CreateArray {


    /*Создать массив N размера и заполнить рандомными числами*/
    public static int[] create(int N, int diapason) {

        int[] array = new int[N];
        if (diapason == 0) diapason = 40;
        int i = 0;
        Random random = new Random();
        while (i < array.length) {
            array[i] = random.nextInt(diapason) - (int) diapason / 2;
            i++;
        }
        return array;
    }


    /*ВЫВОД МАССИВА*/
    public static void showArray(int[] array) {
        /*Переписываем массив как строку с разделителем и скобками*/
        int ind = 0;
        //String arrayToPrint="";
        while (ind < array.length) {
            if (ind == 0) System.out.print("[" + array[ind] + ", ");
            else if (ind == (array.length - 1)) System.out.println(array[ind] + "]");
            else System.out.print(array[ind] + ", ");
            if ((ind!=0)&&(ind % 20 == 0)) System.out.println();
            //if (i==(array.length-1))  System.out.print(array[i]+"]");
            ind++;
        }
//Инициализация массива
    }
        public static int[] init_array(int n, int d) {
            int[] new_array = create(n, d);
            showArray(new_array);
            return new_array;
        }
        public static int[][] findMIN(int[] array){
        int[][] min= new int[1][2];
        int i=0;
            while (i<array.length)
            {
                if (min[0][1]>array[i]) {
                    min[0][0]=i;
                    min[0][1]=array[i];

                }

                ++i;
            }
        return min;
                }
        public static int[][]findMAX(int[] array){
            int[][] max= new int[1][2];
            int i=0;
            while (i<array.length)
            {
                if (max[0][1]<array[i]) {
                    max[0][0]=i;
                    max[0][1]=array[i];

                }

                ++i;
            }
            return max;
        }
    }

