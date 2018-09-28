package conversion;

import person.Client;

/**
 * Data for conversion operation
 */
public class ConvertData {

    /**
     *  Client who requested money exchange
     */
    private Client client;

    /**
     * Incoming money (currency and amount)
     */
    private Money moneyFrom;

    /**
     * Requested currency
     */
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
