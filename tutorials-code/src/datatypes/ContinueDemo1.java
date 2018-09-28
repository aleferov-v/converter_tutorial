package datatypes;

public class ContinueDemo1 {
    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
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
