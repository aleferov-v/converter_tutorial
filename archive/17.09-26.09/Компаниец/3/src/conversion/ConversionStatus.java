package conversion;

public class ConversionStatus {

    public static final int OK = 0;
    public static final int ERR = 1;

    public int code;
    public String message;

    public ConversionStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean isOK() { return code == OK; }

    public String getMessage() { return message; }
}
