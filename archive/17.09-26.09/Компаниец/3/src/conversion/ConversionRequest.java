package conversion;

public class ConversionRequest {

    private Money moneyFrom;
    private Currency currencyTo;
    private double rateFrom;
    private double rateTo;
    private static int requestCounter;

    public ConversionRequest(Money moneyFrom, Currency currencyTo, double rateFrom, double rateTo) {
        this.moneyFrom = moneyFrom;
        this.currencyTo = currencyTo;
        this.rateFrom = rateFrom;
        this.rateTo = rateTo;
    }

    public Money getMoneyFrom() {
        return moneyFrom;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public double getRateFrom() {
        return rateFrom;
    }

    public double getRateTo() {
        return rateTo;
    }

    public static int getRequestCounter() {
        return requestCounter;
    }


}
