package files;

import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String s = "Byte array string";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(s.getBytes());
        baos.writeTo(new FileOutputStream("./resources/fos2.txt"));
    }
}
