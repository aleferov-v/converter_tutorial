package services;

import conversion.Currency;
import exceptions.ConverterException;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class CentralBankService {

    //Singleton implementation
    private static CentralBankService CentralBankServiceInstance = new CentralBankService();

    public static CentralBankService getInstance() { return CentralBankServiceInstance; }

    private CentralBankService() {
    }

    private static final double USD_RATE = 67.01;
    private static final double EUR_RATE = 78.36;
    private static final double GBP_RATE = 88.23;
    private static final double RUB_RATE = 1;

    private Map<Currency, Double> currencyMap = new HashMap<>();
    {
        currencyMap.put(Currency.RUB, RUB_RATE);
        currencyMap.put(Currency.USD, USD_RATE);
        currencyMap.put(Currency.EUR, EUR_RATE);
        currencyMap.put(Currency.GBP, GBP_RATE);
    }


    //Get exchange rate for given currency
    public double getCurrentRate (Currency currency) throws ConverterException {
        Double currentRate = currencyMap.get(currency);
        if (currentRate == null) {
            throw new ConverterException();
        }
        doSmth(new Double(1));
        doSmth("", "", "");
        return currentRate;

    }

    public void doSmth(Object... o) {

    }
}
