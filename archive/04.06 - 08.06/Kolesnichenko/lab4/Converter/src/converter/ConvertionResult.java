package converter;

import currency.CourseRate;
import currency.MoneyType;

public class ConvertionResult extends OperationStatus {


    private MoneyType currencyOut;

    private MoneyType currencyIn;

    private double course;

    public void setCourse(double course) {
        this.course = course;
    }

    public double getCourse() {
        return course;
    }

    public MoneyType getCurrencyOut() {
        return currencyOut;
    }

    public void setCurrencyOut(MoneyType currencyOut) {
        this.currencyOut = currencyOut;
    }

    public MoneyType getCurrencyIn() {
        return currencyIn;
    }

    public void setCurrencyIn(MoneyType currencyIn) {
        this.currencyIn = currencyIn;
    }


}
