package conversion;

public class ConversionResult {
    public Money moneyFrom;
    public Money moneyTo;

    public ConversionResult(Money moneyFrom, Money moneyTo) {
        this.moneyFrom = moneyFrom;
        this.moneyTo = moneyTo;
    }
}
