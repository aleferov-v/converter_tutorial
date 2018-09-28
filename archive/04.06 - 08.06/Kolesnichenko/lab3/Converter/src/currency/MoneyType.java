package currency;

import database.CourseRate;

public class MoneyType {
    /**
     * Валютный тип для конвертера: код валюты и значение
     */
    private CurrencyCode type;

    /**
     * Значение валюты
     */
    private double value;

    public CurrencyCode getType() {
        return type;
    }

    public void setType(CurrencyCode type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
