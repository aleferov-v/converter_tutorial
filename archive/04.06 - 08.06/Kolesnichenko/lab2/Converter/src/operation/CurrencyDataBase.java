package operation;

public class CurrencyDataBase {


    public static MoneyType useReference(MoneyType currencyIn, CurrencyType type) {
        MoneyType currencyOut = new MoneyType();
        currencyOut.setType(type);
        Currency currInInfo = Currency.valueOf(currencyIn.getType().toString());
        Currency currOutInfo = Currency.valueOf(type.toString());
        if (currencyIn.getType() == CurrencyType.RUB) {
            /*Покупка
             *outB = inB/sell/rate
             * */
            currencyOut.setValue(currencyIn.getValue() / currOutInfo.buyPrice / currOutInfo.courseRate);

        } else if (currencyIn.getType() != CurrencyType.RUB && type == CurrencyType.RUB) {
            /*Продажа
             * outS = inS*buy/rate
             * */
            currencyOut.setValue(currencyIn.getValue() * currOutInfo.sellPrice / currOutInfo.courseRate);
        } else {
            /*Конверсия(принес определенную сумму)
             * in*buyIn/sellOut/rateIn*rateOut
             */
            double cross = currInInfo.buyPrice / currOutInfo.sellPrice;
            currencyOut.setValue(currencyIn.getValue() * cross / currInInfo.courseRate * currOutInfo.courseRate);
        }
        return currencyOut;
    }


    enum Currency {
        USD(62.0475, 62.0500, 1),
        EUR(72.7375, 72.7400, 1),
        RUB(1.0, 1.0, 1);

        private double buyPrice; //покупка
        private double sellPrice; //продажа
        private int courseRate; //котировка

        Currency(double buy, double sell, int rate) {
            this.buyPrice = buy;
            this.courseRate = rate;
            this.sellPrice = sell;
        }

    }
}

