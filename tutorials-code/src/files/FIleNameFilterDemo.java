package files;

import java.io.File;
import java.io.FilenameFilter;

public class FIleNameFilterDemo {
    public static void main(String[] args) {
        File file = new File("resources");
        String[] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.equals(".txt");
            }
        });
        for (String f : files) {
            System.out.println(f);
        }
    }
}
