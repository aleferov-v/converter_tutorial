package conversion.converter;

import conversion.*;
import person.Client;
import person.Operator;

/**
 * Class that implements the currency converter interface
 */
public class CurrencyConverter implements ICurrencyConverter {

    @Override
    public ConversionResult convert (ConvertData data, Operator operator) {

        ConversionResult conversionResult;
        Client client = data.getClient();

        if (operator.checkClientId(client)) {
            ConversionRequest request = operator.createConversionRequest(data);
            double result = (request.getMoneyFrom().getAmount() * request.getRateFrom()) / request.getRateTo();

            //Prepare conversion result
            Money moneyFrom = request.getMoneyFrom();
            Money moneyTo = new Money(request.getCurrencyTo(), result);

            ConversionStatus conversionStatus = new ConversionStatus(ConversionStatus.OK, "Currency exchange completed successful.");
            conversionResult = new ConversionResult(moneyFrom, moneyTo, conversionStatus);
        } else {
            ConversionStatus conversionStatus = new ConversionStatus(ConversionStatus.ERR, "Currency exchange failed, wrong client ID!");
            conversionResult = new ConversionResult(null, null, conversionStatus);
        }
        return conversionResult;
    }
}
