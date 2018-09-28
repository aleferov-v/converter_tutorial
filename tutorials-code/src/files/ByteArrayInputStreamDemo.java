package files;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String s = "Byte array string";
        ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
        int input = -1;
        while ((input = bais.read()) != -1 ) {
            System.out.print((char) input);
        }
    }
}
