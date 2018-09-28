// Найти наибольший элемент в массиве.


package Exercise;


public class Exercise5 {
    public static void main (String[] args) {

        int intArray[] = {1,2,8,324,-497,0,86, -497};
        int max = intArray[0];

        for (int i=0;i<intArray.length;i++) {
            if (max < intArray[i])
            {
                max = intArray[i];
            }
        }

        System.out.println(max);


    }
}