public class Task3 {
    /*3. Создайте массив, содержащий 10 первых нечетных чисел.
     Выведете элементы массива на консоль в одну строку, разделяя запятой.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        int i=0;

        while (i<array.length){
            if (i==0)  array[i]=1;
            else array[i]=array[i-1]+2;
            ++i;


        }
        CreateArray.showArray(array);
    }
}
