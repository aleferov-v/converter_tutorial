package exceptions;

public class ConverterException extends Exception {
    public ConverterException() {
        super("Currency conversion error has occurred.");
    }
}
