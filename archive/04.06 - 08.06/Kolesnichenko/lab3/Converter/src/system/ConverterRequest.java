package system;

import converter.*;
import currency.*;
import person.*;

public class ConverterRequest {
    /**
     * Идентификатор заявки
     */
    private String id;
    /**
     * Оператор, который проводит операцию
     */

    private Operator operator;
    /**
     * Клиент, на которого формируется заявка
     */

    private Client client;
    /**
     * Статус операции
     */

    private OperationStatus result;
    /**
     * валюта от клиента
     */

    public MoneyType currencyIn = new MoneyType();

    /**
     * валюта для выдачи клиенту
     */
    public MoneyType currencyOut = new MoneyType();

    ConverterRequest(Client client) {
        this.client = client; //
    }

    public OperationStatus getResult() {
        return result;
    }

    public void setResult(OperationStatus result) {
        this.result = result;
    }

    public void setCurrencyOut(CurrencyCode type, double value) {
        this.currencyOut.setValue(value);
        this.currencyOut.setType(type);

    }

    public void setCurrencyIn(CurrencyCode type, double value) {
        this.currencyIn.setValue(value);
        this.currencyIn.setType(type);

    }

    public MoneyType getCurrencyOut() {
        return currencyOut;
    }

    public MoneyType getCurrencyIn() {
        return currencyIn;
    }
}
