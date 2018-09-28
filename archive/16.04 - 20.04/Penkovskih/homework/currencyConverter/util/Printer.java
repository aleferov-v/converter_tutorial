package com.company.currencyConverter.util;

import com.company.currencyConverter.converter.ConvertionResult;
import com.company.currencyConverter.converter.OperationResult;

public class Printer {


    public void print(ConvertionResult result) {
        StringBuilder sb = new StringBuilder();

        if (result.getStatus().equals(OperationResult.SUCCESS)) {
            sb.append("/////////////////////////////////////////////////////" + "\n");
            sb.append(result.getStatus());
            sb.append("Средств получено: ");
            sb.append(result.getInputAmount() + "\n");
            sb.append("Исходная валюта: ");
            sb.append(result.getInputCurrency() + "\n");
            sb.append("Средств после конвертации: ");
            sb.append(result.getResultAmmount() + "\n");
            sb.append("Целевая валюта: ");
            sb.append(result.getResultCurrency() + "\n");
            sb.append("/////////////////////////////////////////////////////");
            System.out.println(sb);
        } else {
            sb.append(result.getStatus() + "\n");
            sb.append(result.getErrorMessage() + "\n");
            System.out.println(sb);
        }
    }
}
