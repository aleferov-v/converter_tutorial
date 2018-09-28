package conversion;

import person.Client;

public class ConvertData {
    private Client client;
    private Money moneyFrom;
    private Currency currencyTo;

    public ConvertData(Client client, Money moneyFrom, Currency currencyTo) {
        this.client = client;
        this.moneyFrom = moneyFrom;
        this.currencyTo = currencyTo;
    }

    public Client getClient() {
        return client;
    }

    public Money getMoneyFrom() {
        return moneyFrom;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }
}
