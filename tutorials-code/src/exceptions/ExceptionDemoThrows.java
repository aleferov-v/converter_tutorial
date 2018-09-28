package exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionDemoThrows {

    public static void main(String[] args) throws FileNotFoundException {
        getFile();
    }

    private static File getFile() throws FileNotFoundException {
        File file = new File("resources/clients.txt");
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        return file;
    }

}
