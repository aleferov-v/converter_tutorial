package conversion;

/**
 * Conversion result.
 * Contains requested currency, amount and conversation status.
 */
public class ConversionResult {

    private Money moneyFrom;
    private Money moneyTo;

    private ConversionStatus conversionStatus;

    public ConversionResult(Money moneyFrom, Money moneyTo, ConversionStatus conversionStatus) {
        this.moneyFrom = moneyFrom;
        this.moneyTo = moneyTo;
        this.conversionStatus = conversionStatus;
    }

    public Money getMoneyFrom() {
        return moneyFrom;
    }

    public Money getMoneyTo() {
        return moneyTo;
    }

    public ConversionStatus getConversionStatus() {
        return conversionStatus;
    }

}
