package files;

import java.io.File;

public class FileRenameDemo {
    public static void main(String[] args) {
        File file = new File("resources/renameDemo");
        file.renameTo(new File("resources/1/renameDemo2"));
    }
}
