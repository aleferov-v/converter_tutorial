/**
 * Homework #3: Generate first 10 odd positive numbers
 */
public class HomeWorkArray3 {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        intArray[0]=1;

        System.out.println("Generated array of first 10 odd integers is:");
        System.out.print(intArray[0]);

        for (int i=1; i < intArray.length; i++) {
            intArray[i] = intArray[i-1] + 2;
            System.out.print("," + intArray[i]);
        }
    }
}
