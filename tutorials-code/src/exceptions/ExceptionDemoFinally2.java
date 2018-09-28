package exceptions;

public class ExceptionDemoFinally2 {

    public static void main(String[] args) {
        try {
            int[] i = new int[5];
            i[2] = 0;
            try {
                i[3] = 50 / 2;
            } catch (ArithmeticException ex) {
                System.out.println("ArithmeticException error");
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException error");
        } finally {
            System.out.println("Finally block");
        }
    }
}
