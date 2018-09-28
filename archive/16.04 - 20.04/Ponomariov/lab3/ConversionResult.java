/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.ponomariev.lab3;

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

    /**
     * @return the operationResult
     */
    public OPERATION_RESULT getOperationResult() {
        return operationResult;
    }

    /**
     * @param operationResult the operationResult to set
     */
    public void setOperationResult(OPERATION_RESULT operationResult) {
        this.operationResult = operationResult;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the inputCurrency
     */
    public String getInputCurrency() {
        return inputCurrency;
    }

    /**
     * @param inputCurrency the inputCurrency to set
     */
    public void setInputCurrency(String inputCurrency) {
        this.inputCurrency = inputCurrency;
    }

    /**
     * @return the inputAmount
     */
    public double getInputAmount() {
        return inputAmount;
    }

    /**
     * @param inputAmount the inputAmount to set
     */
    public void setInputAmount(double inputAmount) {
        this.inputAmount = inputAmount;
    }

    /**
     * @return the resultCurrency
     */
    public String getResultCurrency() {
        return resultCurrency;
    }

    /**
     * @param resultCurrency the resultCurrency to set
     */
    public void setResultCurrency(String resultCurrency) {
        this.resultCurrency = resultCurrency;
    }

    /**
     * @return the resultAmount
     */
    public double getResultAmount() {
        return resultAmount;
    }

    /**
     * @param resultAmount the resultAmount to set
     */
    public void setResultAmount(double resultAmount) {
        this.resultAmount = resultAmount;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    
}