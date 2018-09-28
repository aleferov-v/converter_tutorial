package currency.convertion;

// сумма денег и валюта
public class Money {

    private Currency currency; // валюта
    private double amount;  // сумма денег


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
