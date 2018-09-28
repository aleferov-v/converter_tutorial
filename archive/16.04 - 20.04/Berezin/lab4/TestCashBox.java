package lab4;

import org.junit.Assert;
import org.junit.Test;

public class TestCashBox {

    /**
     * Тест_1
     * получение баланса валюты
     */
    @Test
    public void testCashBoxGetBalance() {

        double rubBalance = Cashbox.getAmount("RUB");
        Assert.assertNotNull(rubBalance);

    }

    /**
     * Тест_2
     * проверка поплолнения баланса в кассе
     */
    @Test
    public void testCashBoxBalanceUp() {

        double rubBalanceBefore = Cashbox.getAmount("RUB");
        double sumToBeAdded = 100;
        Cashbox.BalanceUP("RUB",sumToBeAdded);
        double rubBalanceAfter = Cashbox.getAmount("RUB");
        Assert.assertTrue(rubBalanceAfter - rubBalanceBefore == sumToBeAdded);

    }

    /**
     * Тест_3
     * проверка уменьшения баланса в кассе
     */
    @Test
    public void testCashBoxBalanceDown() {

        double rubBalanceBefore = Cashbox.getAmount("RUB");
        double sumToBeMoved = 100;
        Cashbox.BalanceDown("RUB",sumToBeMoved);
        double rubBalanceAfter = Cashbox.getAmount("RUB");
        Assert.assertTrue(rubBalanceBefore - rubBalanceAfter == sumToBeMoved);

    }
}
