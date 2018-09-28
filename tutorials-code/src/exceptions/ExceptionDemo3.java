package exceptions;

public class ExceptionDemo3 {

    public static void main(String[] args) {
        try {
            int[] i = new int[5];
            i[6] = 0;
            try {
                i[5] = 50 / 0;
            } catch (ArithmeticException ex) {
                System.out.println("ArithmeticException error");
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException error");
        }
    }
}
