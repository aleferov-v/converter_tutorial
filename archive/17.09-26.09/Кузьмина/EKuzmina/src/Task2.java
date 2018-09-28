public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {1,2,6,7,8,9,10,11,51,77};
        double sum = 0;
        double avg;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        avg = sum/intArray.length;

        System.out.println(avg);
    }
}
