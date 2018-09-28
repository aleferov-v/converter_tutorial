package lab2;

public class Cashbox {

    private double USD = 12500;
    private double EUR = 14250;
    private double RUB = 1_500_000;

    public double getDollars() {
        return USD;
    }

    public void setDollars(double dollars) {
        this.USD = dollars;
    }

    public double getEuros() {
        return EUR;
    }

    public void setEuros(double euros) {
        this.EUR = euros;
    }

    public double getRoubles() {
        return RUB;
    }

    public void setRoubles(double roubles) {
        this.RUB = roubles;
    }
}
