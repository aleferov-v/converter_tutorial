package com.company.currencyConverter.converter;

import com.company.currencyConverter.client.Client;
import com.company.currencyConverter.interfaces.IConverter;
import com.company.currencyConverter.operator.Operator;
import com.company.currencyConverter.services.CentralBankService;
import com.company.currencyConverter.util.Printer;


public class ConverterImpl implements IConverter {
    private boolean checkOK = false;
    private ConvertionResult result;
    private CentralBankService cbs;
    private Printer printer;
    private String errorMSG;

    public ConverterImpl(Client client, Operator operator) {
        checkOK = operator.check(client);
        cbs = new CentralBankService();

        if (checkOK) {
            operator.createConvertationRequest(client, EnumCurrency.USD, 100.00, EnumCurrency.RUB,
                    cbs.getCurrentRate());
        } else {
            errorMSG = operator.getErrorMSG();
        }

    }

    @Override
    public ConvertionResult convert() {
        printer = new Printer();
        ConvertationRequest convReq = ConvertationRequest.getInstance();
        result = new ConvertionResult();

        if (convReq.getAmountFrom() > 0 && checkOK) {
            result.setStatus(OperationResult.SUCCESS);
            result.setInputAmount(convReq.getAmountFrom());
            result.setInputCurrency(convReq.getCurrencyFrom());
            result.setResultAmmount(convReq.getAmountFrom() * convReq.getCurrentRate());
            result.setResultCurrency(convReq.getCurrencyTo());
            result.setCourse(convReq.getCurrentRate());
            printer.print(result);

        } else {

            result.setStatus(OperationResult.ERROR);
            result.setErrorMessage(errorMSG);
            printer.print(result);
        }
        return result;
    }
}
