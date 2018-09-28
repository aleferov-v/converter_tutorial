package datatypes;

public class PrimitiveDemo3 {
    public static void main(String[] args) {
        long l = 100_000_000;
        int i = 50000;
        //int sum = l + i; // Compile error
        long sum = l + i;
        System.out.println(sum); // 100050000
    }
}
