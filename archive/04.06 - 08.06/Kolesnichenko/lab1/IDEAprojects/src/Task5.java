public class Task5 {
    public static void main(String[] args) {
        /*5. Найти наибольший элемент в массиве.*/
        CreateArray creator = new CreateArray();
        //N =100
        int[] array=creator.init_array(100,40);
        //Найти максимальное значение всего массива
        int[][] max= creator.findMAX(array);

        int i=0;
        System.out.println("Max value(s)");
        while (i<array.length){
            if (array[i]==max[0][0]) {

                System.out.print(" "+array[i]+"["+i+"]");}
            i++;
        }
    }
}
