
public class Task4 {
    /*4. Дан массив размерности N, найти наименьший элемент массива
    и вывести на консоль (если наименьших элементов несколько — вывести их все).*/
    public static void main(String[] args) {
        CreateArray creator = new CreateArray();
        //N =100
       int[] array=creator.init_array(100,40);

    //Найти минимальное значение всего массива
        int[][] min= creator.findMIN(array);
        int i=0;
        System.out.println("Min value(s)");
        while (i<array.length){
            if (array[i]==min[0][0]) {

                System.out.print(" "+array[i]+"["+i+"]");}
            i++;
        }
            }
}
