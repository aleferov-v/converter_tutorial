package converter;

import currency.*;

public class ConvertionResult extends OperationStatus {


   private MoneyType currencyOut;

   private MoneyType currencyIn;

//    private MoneyType cource;





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
