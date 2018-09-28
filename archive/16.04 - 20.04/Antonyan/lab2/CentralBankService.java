/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;


public class CentralBankService {

    public double getCurrentRate(String inputCurrency, String resultCurrency) {
        double result = 0.0;

        double fromRate = getFromRate(inputCurrency);
        double toRate = getToRate(resultCurrency);

        return fromRate/toRate;
    }

    public double getToRate(String resultCurrency) {
        return 0.0;
    }

    public double getFromRate(String inputCurrency) {
        return 0.0;
    }

}