package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./resources/fos.txt");
            byte[] bb = new byte[]{84, 111, 32, 70, 105, 108, 101, 79, 117, 116, 112, 117, 116, 83, 116, 114, 101, 97, 109};
            fos.write(bb);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
