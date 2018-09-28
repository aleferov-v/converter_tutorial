package files;

import java.io.File;
import java.io.IOException;

public class FileDirDemo {
    public static void main(String[] args) {
        File file = new File("./resources/1/fileDemo");
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
