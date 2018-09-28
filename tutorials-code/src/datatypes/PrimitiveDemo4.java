package datatypes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PrimitiveDemo4 {
    public static void main(String[] args) {
        float f = 234.9f;
        double d = 678.8;
        //float sum = f + d; // Compile error
        byte sum_byte = (byte) (f + d);
        double sum_double = f + d;
        int sum_int = (int) (f + d);
        System.out.println(sum_double); // 913.6999938964843
        System.out.println(sum_byte);
    }
}
