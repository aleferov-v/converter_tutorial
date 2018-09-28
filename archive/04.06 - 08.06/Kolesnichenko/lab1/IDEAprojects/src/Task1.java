

public class Task1 {
    /*Дан массив целых чисел, найти среди элементов массива числа,
   которые делятся на 3 и на 6*/
    public static void main(String[] args) {
        CreateArray creator = new CreateArray();
        /*n - Число символов, diapason - интервал значений
        [-d/2; d/2]*/
        int[] array=creator.init_array(40, 100);

        int i = 0;
        String resultDivider3="";
        String resultDivider6="";
        while (i<array.length){
            if ((array[i] % 3 == 0)) {
                resultDivider3+=" "+array[i];
                if ((array[i]%2)==0) resultDivider6+=" "+array[i];

            }
            ++i;
        }
//Вывод на печать
        System.out.println("Numbers divide by 3: "+resultDivider3);
        System.out.println("Numbers divide by 6: "+resultDivider6);
           }


    }


