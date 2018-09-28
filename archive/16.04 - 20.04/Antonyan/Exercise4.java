// Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).

package Exercise;


public class Exercise4 {
    public static void main (String[] args) {

        int intArray[] = {1,2,8,324,-497,0,86, -497};
        int min = intArray[0];

        for (int i=0;i<intArray.length;i++) {
            if (min > intArray[i])
            {
                min = intArray[i];
            }
        }

        System.out.println(min);

        // как вывести НЕСКОЛЬКО наименьших - не сообразил :(

    }
}
