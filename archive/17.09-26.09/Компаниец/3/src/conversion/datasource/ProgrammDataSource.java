package conversion.datasource;

import conversion.ConvertData;
import conversion.Currency;
import conversion.Money;
import person.Client;
import person.DUL;
import util.Util;

public class ProgrammDataSource implements IDataSource {

    @Override
    public ConvertData getConvertData() {
        DUL document = createDocument();
        Client client = createClient(document);
        Money moneyFrom = createMoney();

        return new ConvertData(client, moneyFrom, Currency.GBP);
    }

    private Client createClient(DUL document) {
        return new Client("Petrov Ivan Sidorovich", Util.convertStringToDate("14.12.1979"), document);
    }

    private DUL createDocument() {
        DUL document = new DUL();
        document.setType("Passport");
        document.setSerial("43 11");
        document.setNumber("445522");
        document.setCode("770-021");
        document.setDate(Util.convertStringToDate("13.04.2013"));
        return document;
    }

    private Money createMoney() {
        return new Money(Currency.EUR, 123_456);
    }

}
