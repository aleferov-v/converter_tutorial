package converter;

import currency.CurrencyCode;

import java.util.HashMap;
import java.util.Map;

public class Rates {

    public static class Price {
        double sellPrice;
        double buyPrice;
        int rate;

        public Price(double sellPrice, double buyPrice, int rate) {
            this.sellPrice = sellPrice;
            this.buyPrice = buyPrice;
            this.rate = rate;
        }

        public double getBuyPrice() {
            return buyPrice;
        }

        public double getSellPrice() {
            return sellPrice;
        }

        public int getRate() {
            return rate;
        }
    }

    public static Map<CurrencyCode, Price> rates = new HashMap<>();

    static {
        rates.put(CurrencyCode.EUR, new Price(60.48, 62.0, 1));
        rates.put(CurrencyCode.USD, new Price(50.48, 52.0, 1));
    }

}
