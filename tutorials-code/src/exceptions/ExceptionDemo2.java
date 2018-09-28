package exceptions;

import java.util.prefs.PreferenceChangeEvent;

public class ExceptionDemo2 {

    public static void main(String[] args) throws ParentException {
        throw new ParentException();
    }

}

class ParentA {
    public void doSmth() {
        System.out.println("!");
    }
}

class ChildA extends ParentA {

    @Override
    public void doSmth() throws RuntimeException {
        System.out.println("?");
    }
}

class ParentException extends Exception {

    ParentException() {
        super("Мое исключение");
    }
}

class ChildException extends ParentException {

}