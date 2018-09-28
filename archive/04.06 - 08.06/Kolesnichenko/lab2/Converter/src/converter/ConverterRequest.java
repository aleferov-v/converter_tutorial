package converter;

import person.Client;
import operation.CurrencyType;
import operation.MoneyType;
import operation.Operator;

/**
 * Заявка конвертеру для конвертации валюты
 */
public class ConverterRequest {

    /**
     * Оператор кассы
     */
    private Operator operator;

    /**
     * Клиент
     */
    private Client client;

    /**
     * Результат конвертации
     */
    private ConvertionResult result;

    private MoneyType currencyIn; //валюта от клиента

    private MoneyType currencyOut; //валюта для выдачи клиенту

    public ConverterRequest(Client client) {
        this.client = client; //нет set, чтобы одна заявка на одного клиента без возможности его переписать
    }

    public void setCurrencyIn(CurrencyType type, double value) {
        this.currencyIn = new MoneyType();
        this.currencyIn.setValue(value);
        this.currencyIn.setType(type);

    }

    public void setCurrencyOut(MoneyType currencyOut) {
        this.currencyOut = currencyOut;
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

    public void setClient(Client client) {
        this.client = client;
    }

    public ConvertionResult getResult() {
        return result;
    }

    public void setResult(ConvertionResult result) {
        this.result = result;
    }

    public MoneyType getCurrencyIn() {
        return currencyIn;
    }

    public void setCurrencyIn(MoneyType currencyIn) {
        this.currencyIn = currencyIn;
    }

    public MoneyType getCurrencyOut() {
        return currencyOut;
    }
}
