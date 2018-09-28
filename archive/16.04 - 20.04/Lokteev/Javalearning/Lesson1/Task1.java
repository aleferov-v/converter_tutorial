package JavaBasic.Lesson1;

/*
Дан массив целых чисел, найти среди элементов массива числа, которые на 3 и на 6
*/


public class Task1 {
    public static void main(String[] args) {

        int[] mas = {1,3,5,6,7,8,9,12};
        int a3;
        int a6;
        System.out.println("Числа которые делятся на 3");
        for (int i = 0; i <mas.length ; i++) {

            a3= mas[i]%3;
            if (a3==0){

                System.out.println(mas[i]);
            }
         }
        System.out.println("Числа которые делятся на 6");
        for (int i = 0; i <mas.length ; i++) {


            a6= mas[i]%6;
            if (a6==0){

                System.out.println(mas[i]);
            }
         }
    }
}
