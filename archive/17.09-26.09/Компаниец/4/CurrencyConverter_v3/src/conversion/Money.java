package conversion;

/**
 * Money object contains currency and amount
 */
public class Money {
    private Currency currency;
    private double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

}
