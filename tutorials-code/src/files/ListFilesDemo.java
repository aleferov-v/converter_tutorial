package files;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File file = new File("resources");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
