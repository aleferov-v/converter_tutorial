package files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("./resources/fos.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String toWrite = "To FileOutputStream";
            bos.write(toWrite.getBytes());
            bos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
