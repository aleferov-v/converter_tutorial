package com.company.currencyConverter.operator;

import com.company.currencyConverter.client.Client;
import com.company.currencyConverter.converter.ConvertationRequest;
import com.company.currencyConverter.converter.EnumCurrency;

public class Operator {
    private String errorMessage;

    public String getErrorMSG() {
        return errorMessage;
    }

    public boolean check(Client client) {
        if ((!client.getFullName().isEmpty()) && (!client.getDocuments().isEmpty())) {
            return true;
        }
        errorMessage = "клиент не предоставил обязательные данные(ФИО или Документ удостоверяющий личность)";

        return false;
    }

    public void createConvertationRequest(Client client, EnumCurrency currencyFrom,
                                          double amountFrom, EnumCurrency currencyTo, double currentRate) {

        if ((client != null) && (currencyFrom != null)
                && (amountFrom > 0) && (currencyTo != null) && (currentRate != 0)) {
            ConvertationRequest convertationRequest = ConvertationRequest.getInstance();

            convertationRequest.setClient(client);
            convertationRequest.setCurrencyFrom(currencyFrom);
            convertationRequest.setAmountFrom(amountFrom);
            convertationRequest.setCurrencyTo(currencyTo);
            convertationRequest.setCurrentRate(currentRate);


        }

    }
}
