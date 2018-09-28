import conversion.ConversionResult;
import conversion.ConvertData;
import conversion.Currency;
import conversion.Money;
import conversion.converter.CurrencyConverter;
import person.Client;
import person.DUL;
import person.Operator;
import util.Printer;
import util.Util;

public class Converter {
    private CurrencyConverter converter;
    //  private Printer printer;
    private Operator operator;
    private Client client;
    private DUL document;

    Converter() {
        this.converter = new CurrencyConverter();
    //  this.printer = new Printer();
    }

    public void run() {

        Operator operator = new Operator("Sidoroff1-SS", "1234/113");

        DUL document = new DUL();
        document.setType("Passport");
        document.setSerial("43 11");
        document.setNumber("445522");
        document.setCode("770-021");
        document.setDate(Util.convertStringToDate("13.04.2013"));

        Client client = new Client("Petrov Ivan Sidorovich", Util.convertStringToDate("14.12.1979"), document);

        Money moneyGiven = new Money(Currency.EUR, 123_456);

        ConvertData convertData = new ConvertData(client, moneyGiven, Currency.GBP);

        ConversionResult conversionResult = converter.convert(convertData, operator);

        Printer.print(conversionResult);

    }
}
