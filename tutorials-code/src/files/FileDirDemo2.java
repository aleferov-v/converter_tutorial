package files;

import java.io.File;

public class FileDirDemo2 {
    public static void main(String[] args) {
        File file = new File("./resources/fileDemo2/dir2");
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
