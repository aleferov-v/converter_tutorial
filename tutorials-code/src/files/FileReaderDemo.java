package files;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) { FileInputStream fis = null;
        try {
            FileReader reader = new FileReader("resources/writerReaderDemo.txt");
            int i = -1;
            while ((i = reader.read()) != -1) {
                System.out.println((char) i);
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
