package system;

import currency.CurrencyCode;

public class NoDataException extends Exception {

    private String message;
    private CurrencyCode currencyCode;


    public NoDataException(String message) {
        super(message);


    }
}
