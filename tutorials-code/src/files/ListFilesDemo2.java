package files;

import java.io.File;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        File file = new File("resources");
        String[] files = file.list();
        for (String f : files) {
            System.out.println(f);
        }
    }
}
