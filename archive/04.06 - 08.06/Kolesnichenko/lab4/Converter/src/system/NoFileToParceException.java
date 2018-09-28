package system;

public class NoFileToParceException extends Exception {
    private String path;

    public NoFileToParceException(String message) {
        super(message);

    }

}