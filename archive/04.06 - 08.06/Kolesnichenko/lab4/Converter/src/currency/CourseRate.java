package currency;

public class CourseRate {

    /**
     * Котировка
     */
    private int rate;

    /**
     * Стоимость
     */

    /**
     * Покупка
     */

    private double buyPrice;

    /**
     * Продажа
     */

    private double sellPrice;


    /**
     * Курс валют: цена и котировка
     */

    public CourseRate(double buy, double sell, int rate) {

        this.buyPrice = buy;

        this.sellPrice = sell;

        this.rate = rate;

    }

    public CourseRate() {
        // Do nothing
        //
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


    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


}
