package person;

import conversion.ConvertData;
import conversion.ConversionRequest;
import conversion.Currency;
import conversion.Money;
import exceptions.ConverterException;
import services.CentralBankService;

public class Operator extends Person {
    protected String login;
    protected String vsp;

    public Operator(String login, String vsp) {
        super(login);
        this.vsp = vsp;
    }

    public ConversionRequest createConversionRequest(ConvertData data) {
        Money moneyFrom = data.getMoneyFrom();
        Currency currencyTo = data.getCurrencyTo();
        double rateFrom = 0;
        double rateTo = 0;

        CentralBankService centralBankService = CentralBankService.getInstance();

        try {
            rateFrom = centralBankService.getCurrentRate(moneyFrom.getCurrency());
            rateTo = centralBankService.getCurrentRate(currencyTo);
        } catch (ConverterException ex) {
            System.err.println("Central Bank service is unavailable, please try again later.");
            ex.printStackTrace();
        }

        return new ConversionRequest(moneyFrom, currencyTo, rateFrom, rateTo);
    }

    public boolean checkClientId(Client client) {
        return client.getDocument() != null;
    }
}
