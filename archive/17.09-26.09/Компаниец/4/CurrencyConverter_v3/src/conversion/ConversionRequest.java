package conversion;

/**
 * Building a request for currency conversion
 */
public class ConversionRequest {

    /**
     * Incoming Money object (Currency, amount)
     */
    private Money moneyFrom;

    /**
     * Requested currency
     */
    private Currency currencyTo;

    /**
     * Current exchange rates
     */
    private double rateFrom;
    private double rateTo;

    // TBD
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

    // TBD
    public static int getRequestCounter() {
        return requestCounter;
    }

}
