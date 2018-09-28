package database;

import currency.*;

public class CourseRate {
    /**
     * Код валюты
     */
    private CurrencyCode code;
    /**
     * Котировка
     */
    private int rate;

    /**
     * Покупка
     */

    private double buyPrice;

    /**
     * Продажа
     */

    private double sellPrice;


    public CurrencyCode getCode() {
        return code;
    }

    public void setCode(CurrencyCode code) {
        this.code = code;

    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
