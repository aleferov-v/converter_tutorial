package conversion.converter;

import conversion.ConvertData;
import conversion.ConversionRequest;
import conversion.ConversionResult;
import conversion.Money;
import person.Operator;

public class CurrencyConverter implements ICurrencyConverter {

    @Override
    public ConversionResult convert (ConvertData data, Operator operator) {
        ConversionRequest request = operator.createConversionRequest(data);
        double result = (request.getMoneyFrom().getAmount() * request.getRateFrom()) / request.getRateTo();

        //Prepare conversion result
        Money moneyFrom = request.getMoneyFrom();
        Money moneyTo = new Money(request.getCurrencyTo(), result);

        return new ConversionResult(moneyFrom, moneyTo);
    }

}
