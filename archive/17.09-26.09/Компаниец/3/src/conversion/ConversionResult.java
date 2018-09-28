package conversion;

public class ConversionResult {
    public Money moneyFrom;
    public Money moneyTo;
    public ConversionStatus conversionStatus;
    public double rateFrom;
    public double rateTo;

    public ConversionResult(Money moneyFrom, Money moneyTo, ConversionStatus conversionStatus) {
        this.moneyFrom = moneyFrom;
        this.moneyTo = moneyTo;
        this.conversionStatus = conversionStatus;
    }
}
