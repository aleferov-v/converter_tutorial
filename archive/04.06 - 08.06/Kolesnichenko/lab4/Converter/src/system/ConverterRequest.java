package system;

import converter.OperationStatus;
import currency.CurrencyCode;
import currency.MoneyType;
import person.Client;
import person.Operator;

public class ConverterRequest {
    /**
     * валюта от клиента
     */

    public MoneyType currencyIn;
    /**
     * валюта для выдачи клиенту
     */
    public MoneyType currencyOut;
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

    private Client client = new Client();
    /**
     * Статус операции
     */

    private OperationStatus result;

    public ConverterRequest(String id) {

        this.client.setId(id);
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Client getClient() {
        return client;
    }


    public OperationStatus getResult() {
        return result;
    }

    public void setResult(OperationStatus result) {
        this.result = result;
    }

    public MoneyType getCurrencyOut() {
        return currencyOut;
    }

    public void setCurrencyOut(MoneyType currencyOut) {
        this.currencyOut = currencyOut;
    }

    public void setCurrencyOut(CurrencyCode type, double value) {
        this.currencyOut.setValue(value);
        this.currencyOut.setType(type);

    }

    public MoneyType getCurrencyIn() {
        return currencyIn;
    }

    public void setCurrencyIn(MoneyType currencyIn) {
        this.currencyIn = currencyIn;
    }

    public void setCurrencyIn(CurrencyCode type, double value) {
        this.currencyIn = new MoneyType();
        this.currencyIn.setValue(value);
        this.currencyIn.setType(type);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "ConverterRequest{" +
                "result=" + result +
                ", currencyIn=" + currencyIn +
                ", currencyOut=" + currencyOut +
                '}';
    }
}
