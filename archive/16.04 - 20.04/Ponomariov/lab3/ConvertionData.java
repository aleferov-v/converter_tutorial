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
public class ConvertionData {
    private double inputAmount;
    private String inputCurrency;
    private String resultCurrency;
    ConvertionData(double inputAmount,
                                    String inputCurrency,
                                    String resultCurrency){
        this.inputAmount=inputAmount;
        this.inputCurrency=inputCurrency;
        this.resultCurrency=resultCurrency;
    }

    /**
     * @return the inputAmount
     */
    public double getInputAmount() {
        return inputAmount;
    }

    /**
     * @return the inputCurrency
     */
    public String getInputCurrency() {
        return inputCurrency;
    }

    /**
     * @return the resultCurrency
     */
    public String getResultCurrency() {
        return resultCurrency;
    }
}
