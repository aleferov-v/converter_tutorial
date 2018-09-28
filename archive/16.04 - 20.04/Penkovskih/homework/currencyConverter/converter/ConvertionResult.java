package com.company.currencyConverter.converter;

public class ConvertionResult {

    private OperationResult status;
    private String errorMessage;
    private EnumCurrency inputCurrency;
    private double inputAmount;
    private EnumCurrency resultCurrency;
    private double resultAmmount;
    private double course;

    public void setCourse(double course) {
        this.course = course;
    }

    public ConvertionResult(OperationResult error) {
    }

    public ConvertionResult() {

    }

    public OperationResult getStatus() {
        return status;
    }

    public void setStatus(OperationResult status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public EnumCurrency getInputCurrency() {
        return inputCurrency;
    }

    public void setInputCurrency(EnumCurrency inputCurrency) {
        this.inputCurrency = inputCurrency;
    }

    public double getInputAmount() {
        return inputAmount;
    }

    public void setInputAmount(double inputAmount) {
        this.inputAmount = inputAmount;
    }

    public EnumCurrency getResultCurrency() {
        return resultCurrency;
    }

    public void setResultCurrency(EnumCurrency resultCurrency) {
        this.resultCurrency = resultCurrency;
    }

    public double getResultAmmount() {
        return resultAmmount;
    }

    public void setResultAmmount(double resultAmmount) {
        this.resultAmmount = resultAmmount;
    }

    public double getCourse() {
        return course;
    }

    public ConvertionResult result() {
        return result();
    }
}
