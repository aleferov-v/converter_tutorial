package system;

import converter.Converter;
import converter.ConverterRequest;
import converter.ConvertionResult;
import operation.CurrencyType;
import operation.MoneyType;
import operation.Operator;
import operation.Printer;
import person.Client;
import person.ClientStub;

public class Session {
    /*
     * Главный класс программы.
     * Создание заявки (request)
     * Создание и получение клиента. Содание и получение оператора.
     * Считывание входных данных
     * Вызов конвертера converter.Converter()
     *
     * */
    public static void main(String[] args) {
        Client client = new ClientStub();
        Operator operator = new Operator();

        ConverterRequest request = new ConverterRequest(client);
        request.setCurrencyIn(CurrencyType.RUB, 100.00);

        MoneyType outMoneyType = new MoneyType(CurrencyType.EUR, 0.0);
        request.setCurrencyOut(outMoneyType);

        Converter converter = new Converter(request);
        ConvertionResult result = converter.convert();
        //request.setResult(converter.convert());

        new Printer(request, result);
    }
}
