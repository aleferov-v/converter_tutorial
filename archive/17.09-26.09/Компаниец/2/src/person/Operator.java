package person;

import conversion.ConvertData;
import conversion.ConversionRequest;
import conversion.Currency;
import conversion.Money;

public class Operator extends Person {
    protected String login;
    protected String vsp;

    public Operator(String login, String vsp) {
        super(login);
        this.vsp = vsp;
    }

    public ConversionRequest createConversionRequest(ConvertData data) {
        Money moneyFrom = data.getMoneyFrom();
        Currency currencyTo = data.getCurrencyTo();
        double rateFrom = getCurrencyRate(moneyFrom.getCurrency());
        double rateTo = getCurrencyRate(currencyTo);

        return new ConversionRequest(moneyFrom, currencyTo, rateFrom, rateTo);
    }

    private double getCurrencyRate(Currency currency) {
        double result = 1;
        switch (currency) {
            case USD:
                result = 67.01;
                break;
            case EUR:
                result = 78.36;
                break;
            case GBP:
                result = 88.23;
                break;
           case RUB:
                result = 1;
                break;
        }
        return result;
    }
}
