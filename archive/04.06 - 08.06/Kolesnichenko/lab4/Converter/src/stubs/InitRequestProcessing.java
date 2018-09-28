package stubs;

import currency.CurrencyCode;
import currency.MoneyType;
import system.ConverterRequest;

public class InitRequestProcessing {


    /**
     * Имитация заполнения данных заявки
     */


    public ConverterRequest initRequestStub(String id) {

        ConverterRequest requestStub = new ConverterRequest(id);

        requestStub.setCurrencyIn(new MoneyType(CurrencyCode.RUB, 124.00));

        requestStub.setCurrencyOut(new MoneyType(CurrencyCode.USD));

        return requestStub;

    }


}
