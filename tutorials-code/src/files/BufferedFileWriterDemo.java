package files;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriterDemo {
    public static void main(String[] args) { FileInputStream fis = null;
        try {
            FileWriter writer = new FileWriter("resources/bufferedWriterReaderDemo.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("String from to file with FileWriter");
            bw.close(); // попробуйте не закрывать
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
