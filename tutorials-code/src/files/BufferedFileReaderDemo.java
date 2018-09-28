package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderDemo {
    public static void main(String[] args) { FileInputStream fis = null;
        try {
            FileReader reader = new FileReader("resources/writerReaderDemo2.txt");
            BufferedReader br = new BufferedReader(reader);
            int i = -1;
            while ((i = br.read()) != -1) {
                System.out.println((char) i);
            }
            br.close();
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
