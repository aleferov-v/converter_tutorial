package exceptions;

public class ExceptionDemoStackTrace {

    public static void main(String[] args) {
        try {
            a();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void a() {
        b();
    }
    private static void b() {
        c();
    }
    private static void c() {
        throw new RuntimeException();
    }
}
