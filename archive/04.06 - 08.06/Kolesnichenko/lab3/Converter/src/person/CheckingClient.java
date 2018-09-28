package person;

import converter.*;
import person.*;

/**
 * Проверка клиента по параметрам
 */
public class CheckingClient {

    private Client client;

    CheckingClient(Client client) {
        this.client = client;
    }


    public  OperationStatus checkClientDul() {
        /**
         * Проверяет, есть ли у клиента документ
         */
        OperationStatus result;
        if (this.client.getDul()!=null) {

            result = new OperationStatus(ResultCode.SUCCESS, "");
        } else {

            result = new OperationStatus(ResultCode.ERROR, "Нет данных (ДУЛ)");
        }

        return result;
    }
}
