package converter;

public class OperationStatus {
    /*
     * Возвращает результат конвертирования валюты.
     * SUCCESS = успех
     * ERROR = ошибка
     *
     * */


    private ResultCode code;

    private String message;

    public OperationStatus(ResultCode code, String message) {
        this.code = code;
        this.message = message;
    }


    public OperationStatus() {
        this.code = ResultCode.ERROR;
        this.message = "";
    }

    public ResultCode getCode() {
        return code;
    }

    public void setCode(ResultCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "OperationStatus{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
