// Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.  После замены будет выглядеть {4, 8, 0, 6, -5}.

package Exercise;

import java.util.Arrays;

public class Exercise6 {
    public static void main (String[] args) {

        int intArray[] = {4, -5, 0, 6, 8};
        int min = intArray[0];
        int max = intArray[0];

        // Ищем наибольший
        for (int i=0;i<intArray.length;i++) {
            if (max < intArray[i])
            {
                max = intArray[i];
            }
        }

        // Ищем наименьший

        for (int i=0;i<intArray.length;i++) {
            if (min > intArray[i])
            {
                min = intArray[i];
            }
        }

        // Меняем местами
        for (int i=0;i<intArray.length;i++) {
            if (intArray[i]==min) {
                intArray[i]=max;
            }
            else if (intArray[i]==max) {
                intArray[i]=min;
            }
        }

        System.out.println(Arrays.toString(intArray));
    }
}
