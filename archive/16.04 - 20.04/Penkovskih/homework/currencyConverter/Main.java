package com.company.currencyConverter;

import com.company.currencyConverter.client.Client;
import com.company.currencyConverter.converter.ConverterImpl;
import com.company.currencyConverter.converter.EnumCurrency;
import com.company.currencyConverter.interfaces.IConverter;
import com.company.currencyConverter.operator.Operator;
import com.company.currencyConverter.util.Printer;

import java.util.Currency;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Client client = new Client("Ivanov I I", new Date(), "passport");
        Operator operator = new Operator();
        IConverter converter = new ConverterImpl(client, operator);
        converter.convert();


    }
}
