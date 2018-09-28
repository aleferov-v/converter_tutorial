package conversion.converter;
import conversion.ConvertData;
import conversion.ConversionResult;
import person.Operator;

/**
 * Currency converter interface
 */
public interface ICurrencyConverter {

    /**
     * Conversion method
     *
     * @param data: Data for convertation
     * @param operator: Operator
     * @return Result of conversion
     */
    public ConversionResult convert(ConvertData data, Operator operator);
}
