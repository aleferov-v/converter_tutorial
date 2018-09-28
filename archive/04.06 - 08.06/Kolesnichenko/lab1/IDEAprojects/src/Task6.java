public class Task6 {
    public static void main(String[] args) {
       /*Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.
       После замены будет выглядеть {4, 8, 0, 6, -5}.*/
        CreateArray creator = new CreateArray();
        //N =100
        int[] array=creator.init_array(10,40);



        //Найти минимальное значение всего массива
        int[][] min= creator.findMIN(array);
        //Найти максимальное значение всего массива
        int[][] max= creator.findMAX(array);
        System.out.println("MAX_VALUE[i] "+max[0][1]+"["+max[0][0]+"]");
        System.out.println("MIN_VALUE[i] "+min[0][1]+"["+min[0][0]+"]");
        //Поменять значения
        array[max[0][0]]=min[0][1];
        array[min[0][0]]=max[0][1];
        creator.showArray(array);
    }
}
