package files;

import java.io.File;
import java.io.FileFilter;

class FilterClass implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().contains("fos");
    }
}

public class FileFilterDemo {
    public static void main(String[] args) {
        File file = new File("resources");
        FileFilter filter = new FilterClass();
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains("fos");
            }
        });
        for (File f : files) {
            System.out.println(f);
        }
    }
}

interface IFilterTest extends FileFilter {

    void a();
    void b();
    void c();
}
