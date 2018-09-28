package system;

import currency.CurrencyCode;

public class NoDataExeption extends Exception{

    private String message;
    private CurrencyCode currencyCode;


    public NoDataExeption(String message){
        super(message);


    }
}
