package datatypes;

public class PrimitiveDemo5 {
    public static void main(String[] args) {
        byte b = 127;
//        b = 128; // 127 - max
        short s = 32767;
//        s = 32768; // 32767 - max
        long l = 123_456_789;
        l = 123456789l;
        l = 123_456_789L;
        l = 0xAAD1; // 43729
        l = 027; // 23
        l = 0b1001_0101_1001_1011; // 38299
        l = 'A'; // 65;
//        float f = 23.45; // Compile error
        float f = 23.45f;
        double d = 11.33;
        char c = (char) 65; // A
        boolean bool = true;
//        bool = "false"; // Compile error
//        bool = 0; // Compile error

        int a1 = 10;
        int a2 = 15;

        int b1 = 0b1000101;
        int b2 = 0b1110010;
        int b3 = 0b0110111;

        System.out.println(b1 ^ b2);
        System.out.println(b3);


    }
}
