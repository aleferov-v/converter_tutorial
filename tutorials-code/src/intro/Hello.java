package intro;

import java.io.FileNotFoundException;

public class Hello {

    public static void main(String[] args) {
        check("file");
    }

    public static void check(String file) {
        if (file == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(file);
    }
}

