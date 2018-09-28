package exceptions;

/**
 * Custom conversion exception
 */
public class ConverterException extends Exception {
    public ConverterException() {
        super("Currency conversion error has occurred.");
    }
}
