package currency;

public class MoneyType {
    /**
     * Валютный тип для конвертера: код валюты и значение
     */

    private CurrencyCode type;

    /**
     * Значение валюты
     */

    private double value;

    /**
     * Обменный курс валюты на сегодня
     */


    public MoneyType(CurrencyCode type, double value) {
        this.type = type;
        this.value = value;

    }

    public MoneyType(CurrencyCode type) {
        this.type = type;
        this.value = 0.00;

    }

    public MoneyType() {

    }


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


    @Override
    public String toString() {
        return "MoneyType{" +
                "type=" + type +
                ", value=" + value +
                '}';
    }
}
