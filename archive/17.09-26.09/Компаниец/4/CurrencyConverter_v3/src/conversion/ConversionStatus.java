package conversion;

/**
 * Status of a conversion operation
 */
public class ConversionStatus {

    public static final int OK = 0;
    public static final int ERR = 1;

    private int code;
    private String message;

    public ConversionStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean isOK() {
        return code == OK;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
