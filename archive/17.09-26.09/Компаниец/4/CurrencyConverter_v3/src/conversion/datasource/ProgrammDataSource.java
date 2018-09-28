package conversion.datasource;

import conversion.ConvertData;
import conversion.Currency;
import conversion.Money;
import person.Client;
import person.DUL;

/**
 * Class that implements data source interface
 * Prepare ConvertData object generated at runtime
 */
public class ProgrammDataSource implements IDataSource {

    @Override
    public ConvertData getConvertData() {
        DUL document = createDocument("Passport", "43 11", "445522", "770-021", "13.04.2013");
        Client client = createClient("Petrov Ivan Sidorovich", "14.12.1979", document);
        Money moneyFrom = createMoney(Currency.EUR, 123_456);

        return new ConvertData(client, moneyFrom, Currency.GBP);
    }
}
