package files;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) { FileInputStream fis = null;
        try {
            FileWriter writer = new FileWriter("resources/writerReaderDemo.txt");
            writer.write("String from to file with FileWriter");
            writer.close(); // попробуйте не закрывать
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
