/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

/**
 * @author siatl
 */
public class ConvertionData {
    private Client client;
    private double inputAmount;
    private String inputCurrency;
    private String resultCurrency;

    ConvertionData(Client client,
                   double inputAmount,
                   String inputCurrency,
                   String resultCurrency) {
        this.client = client;
        this.inputAmount = inputAmount;
        this.inputCurrency = inputCurrency;
        this.resultCurrency = resultCurrency;
    }


    public Client getClient() {
        return client;
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
