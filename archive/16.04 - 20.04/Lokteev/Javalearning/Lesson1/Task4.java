package JavaBasic.Lesson1;

/*
Вывод на экран наименьшего элемента массива (если элементов несколько выводить все)
*/


import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = {3,2,1,4,1,1};

        Arrays.sort(mas);

        for (int i = 0; i <mas.length ; i++) {

            if (mas[0]==mas[i])
            {
                System.out.print(mas[i]+ " ");
            }
        }

    }
}
