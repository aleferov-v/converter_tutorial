package files;

import java.io.File;
import java.io.IOException;

public class PathsDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./resources/fileDemo2/dir2/.././demo1.txt");
        System.out.println("exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Cannonical path: " + file.getCanonicalPath());
        System.out.println("Path: " + file.getPath());
    }
}
