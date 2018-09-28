package JavaBasic.Lesson1;


/*
Посчитать средне арифметическое чисел в массиве
*/

public class Task2 {
    public static void main(String[] args) {

        int[] mas = new int[10];
        int srednee = 0;
        for (int i = 0; i <mas.length ; i++) {
            mas[i] = i+1;
            srednee = srednee + mas[i];
        }

        srednee = srednee/mas.length;
        System.out.println(srednee);

    }
}
