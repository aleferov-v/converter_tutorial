package files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./resources/fis.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int input = -1;
            while ((input = bis.read()) != -1 ) {
                System.out.println((char) input);
            }
            bis.close();
            fis.close(); // Недостаток?
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
