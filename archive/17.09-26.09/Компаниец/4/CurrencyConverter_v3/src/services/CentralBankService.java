package services;

import conversion.Currency;
import exceptions.ConverterException;

/**
 * Mock Central Bank service that returns currency rates
 * Implemented used the Singleton pattern
 */
public class CentralBankService {

    /* Thread-safe singleton implementation
     * with lazy load.
     */
    private static CentralBankService CentralBankServiceInstance;

    public static synchronized CentralBankService getInstance() {
        if (CentralBankServiceInstance == null) {
            CentralBankServiceInstance = new CentralBankService();
        }
        return CentralBankServiceInstance;
    }

    private CentralBankService() {
    }

    // Currency rates stubs
    private static final double USD_RATE = 67.01;
    private static final double EUR_RATE = 78.36;
    private static final double GBP_RATE = 88.23;
    private static final double RUB_RATE = 1;

    /**
     * Return exchange rate for given currency
     * @param currency Currency
     * @return Rate
     * @throws ConverterException for conversion exceptions
     */
    public double getCurrentRate (Currency currency) throws ConverterException {

        double currentRate = 1;

        switch (currency) {
            case USD:
                currentRate = USD_RATE;
                break;
            case EUR:
                currentRate = EUR_RATE;
                break;
            case GBP:
                currentRate = GBP_RATE;
                break;
            case RUB:
                currentRate = RUB_RATE;
                break;
            default:
                throw new ConverterException();
        }

        return currentRate;
    }
}
