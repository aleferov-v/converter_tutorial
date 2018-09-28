package com.company.currencyConverter.services;

public class CentralBankService {
    private double currentRate = 61.48;

    public double getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(double currentRate) {
        this.currentRate = currentRate;
    }
}
