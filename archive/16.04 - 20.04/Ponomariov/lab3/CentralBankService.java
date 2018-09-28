/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework.ponomariev.lab3;

public class CentralBankService {

    public static double getCurrentRate(String inputCurrency, String outputCurrency) {
        double result = 0.0;

        double fromRate = DataBase.getRate_to_RUB(inputCurrency);
        double toRate = DataBase.getRate_to_RUB(outputCurrency);

        return fromRate/toRate;
    }
}