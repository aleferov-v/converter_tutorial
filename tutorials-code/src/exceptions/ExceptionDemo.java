package exceptions;

public class ExceptionDemo {

    public static void main(String[] args) throws IllegalArgumentException {
        try {
            int i = 50 / 0;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } finally {
            System.exit(1);
        }
        throw new IllegalArgumentException();
    }
}
