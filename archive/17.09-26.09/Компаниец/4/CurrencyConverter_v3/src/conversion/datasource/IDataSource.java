package conversion.datasource;

import conversion.ConvertData;
import conversion.Currency;
import conversion.Money;
import person.Client;
import person.DUL;
import util.Util;

/**
 * Interface for DataSource handler classes
 * Contains default methods with some logic implemented
 */
public interface IDataSource {

    ConvertData getConvertData();

    default DUL createDocument(String type, String serial, String number, String code, String date) {
        DUL document = new DUL();
        document.setType(type);
        document.setSerial(serial);
        document.setNumber(number);
        document.setCode(code);
        document.setDate(Util.convertStringToDate(date));
        return document;
    }

    default Client createClient(String fio, String birthdate, DUL document) {
        return new Client(fio, Util.convertStringToDate(birthdate), document);
    }

    default Money createMoney(Currency currency, double amount) {
        return new Money(currency, amount);
    }

}
