package com.company.currencyConverter.converter;

import com.company.currencyConverter.client.Client;

public class ConvertationRequest {
    private Client client;
    private EnumCurrency currencyFrom;
    private EnumCurrency currencyTo;
    private double amountFrom;
    private double currentRate;

    private static ConvertationRequest convertationRequest;

    public static ConvertationRequest getInstance() {
        if (convertationRequest == null) {
            convertationRequest = new ConvertationRequest();
        }
        return convertationRequest;
    }

    private ConvertationRequest() {
    }


    public void setConvertationRequest(Client client, EnumCurrency currencyFrom, double amountFrom, EnumCurrency currencyTo, double currenRate) {
        this.client = client;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.amountFrom = amountFrom;
        this.currentRate = currenRate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCurrencyFrom(EnumCurrency currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public void setCurrencyTo(EnumCurrency currencyTo) {
        this.currencyTo = currencyTo;
    }

    public void setAmountFrom(double amountFrom) {
        this.amountFrom = amountFrom;
    }


    public void setCurrentRate(double currentRate) {
        this.currentRate = currentRate;
    }


    public Client getClient() {
        return client;
    }

    public EnumCurrency getCurrencyFrom() {
        return currencyFrom;
    }

    public EnumCurrency getCurrencyTo() {
        return currencyTo;
    }

    public double getAmountFrom() {
        return amountFrom;
    }

    public double getCurrentRate() {
        return currentRate;
    }


}
