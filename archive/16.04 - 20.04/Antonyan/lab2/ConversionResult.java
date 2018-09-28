/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author siatl
 */
enum OPERATION_RESULT{
    SUCCESS, ERR
}
public class ConversionResult{
    private OPERATION_RESULT operationResult;
    private String errorMessage;
    private String inputCurrency;
    private double inputAmount;
    private String resultCurrency;
    private double resultAmount;
    private double rate;

    public OPERATION_RESULT getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(OPERATION_RESULT operationResult) {
        this.operationResult = operationResult;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getInputCurrency() {
        return inputCurrency;
    }

    public void setInputCurrency(String inputCurrency) {
        this.inputCurrency = inputCurrency;
    }

    public double getInputAmount() {
        return inputAmount;
    }

    public void setInputAmount(double inputAmount) {
        this.inputAmount = inputAmount;
    }

    public String getResultCurrency() {
        return resultCurrency;
    }

    public void setResultCurrency(String resultCurrency) {
        this.resultCurrency = resultCurrency;
    }

    public double getResultAmount() {
        return resultAmount;
    }

    public void setResultAmount(double resultAmount) {
        this.resultAmount = resultAmount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}