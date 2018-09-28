package currency;

import currency.convertion.ConvertData;
import currency.convertion.ConvertionResult;
import currency.convertion.Currency;
import currency.convertion.Money;
import currency.convertion.CurrencyConverterImpl;
import currency.person.Client;
import currency.person.DUL;
import currency.person.Operator;
import currency.services.Printer;
import currency.services.Utils;

public class Converter {

        private CurrencyConverterImpl converter;
        private Printer printer;
        private Operator operator;
        private DUL dul;
        private Client client;

        public Converter() {
            this.converter = new CurrencyConverterImpl();
            this.printer = new Printer();
        }

        // метод конвертации
        public void run() {
            operator = new Operator("Operator", "1234");

            dul = new DUL();
            dul.setType("Паспорт");
            dul.setSeria("97 07");
            dul.setNumber("263887");
            dul.setDate(Utils.createDateFromString("2005-04-30"));
            dul.setCode("010-201");

            client = new Client("Иванов А.А.", Utils.createDateFromString("1988-11-27"), dul);
            Money from = new Money(Currency.RUB, 10_000);

            ConvertData convertData = new ConvertData(client, from, Currency.USD);

            ConvertionResult convertionResult = converter.convert(convertData, operator);
            printer.print(convertionResult);
        }

}

