package converter;

import operation.OperationResult;

/**
 * Результат конвертации, содержащий код операции и сообщение об ошибке, если она есть
 */
public class ConvertionResult {
    /*
    * Возвращает результат конвертирования валюты.
    * SUCCESS = успех
    * ERROR = ошибка
    *
    * */

    private OperationResult code;

    private String message;

    ConvertionResult(OperationResult code, String message){
        this.code = code;
        this.message = message;
    }

    public OperationResult getCode() {
        return code;
    }



    public String getMessage() {
        return message;
    }


}
