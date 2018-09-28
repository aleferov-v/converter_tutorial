/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

/**
 * @author siatl
 */
public class Cashbox {

    public static double getAmount(String currency) {
        return DataBase.getBalanceCurrency(currency);
    }

    public static void BalanceUP(String currency, double operationAmount) {
        DataBase.BalanceUP(currency, operationAmount);
    }

    public static void BalanceDown(String currency, double operationAmount) {
        DataBase.BalanceDown(currency, operationAmount);
    }
}
