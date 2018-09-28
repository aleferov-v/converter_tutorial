
public class Task2 {
    /*2. Посчитать среднее арифметическое чисел в массиве*/
    public static void main(String[] args) {
        CreateArray creator = new CreateArray();
        int[] array = creator.init_array(4, 100);
        int i=0;
        double result=0;
        double resultForAbs=0;
        while (i<array.length){
            result+=array[i];
            resultForAbs+=Math.abs(array[i]);
            ++i;
        }
        /*Для значений по модулю из массива и для абсолютных*/
        System.out.println("average: "+(float)result/array.length);
        System.out.println("average(numbers as absValue): "+(float)resultForAbs/array.length);
}
}
