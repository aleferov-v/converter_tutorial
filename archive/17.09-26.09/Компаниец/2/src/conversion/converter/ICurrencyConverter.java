package conversion.converter;
import conversion.ConvertData;
import conversion.ConversionResult;
import person.Operator;

public interface ICurrencyConverter {
    public ConversionResult convert(ConvertData data, Operator operator);
}
