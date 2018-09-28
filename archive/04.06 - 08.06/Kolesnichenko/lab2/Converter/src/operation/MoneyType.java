package operation;

import operation.CurrencyType;

public class MoneyType {

    private CurrencyType type;

    private double value;

    public MoneyType(CurrencyType type, double value){
        this.type=type;
        this.value=value;

    }

    public MoneyType(){

    }

    public CurrencyType getType() {
        return type;
    }

    public void setType(CurrencyType type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
