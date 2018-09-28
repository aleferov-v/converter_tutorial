package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemoOverride {

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

class Parent {

    public void doWork() {
        // do something
    }
}

class Child extends Parent {

//    @Override
//    public void doWork() throws IOException {
//        // do something
//    }
//
//
//      @Override
//        public void doWork() throws RuntimeException {
//            // do something
//        }
//
//      @Override
//        public void doWork() throws FileNotFoundException {
//            // do something
//        }

}