package datatypes;

public class BreakDemo1 {
    public static void main(String[] args) {
        for (int count = 10; count > 0; count--) {
            System.out.println("count: " + count);

            for (int i = 1; i <= 10; i++) {
                System.out.println("i: " + i);
                if (count == i) {
                    break;
                }
            }
        }
    }
}
