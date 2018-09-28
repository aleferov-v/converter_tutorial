package currency.person;

import currency.convertion.ConvertData;
import currency.convertion.ConvertionRequest;
import currency.convertion.Currency;
import currency.convertion.Money;

// класс для конвертации
public class Operator extends Person {

    private String login;
    private String vsp;

    public Operator (String login, String vsp){
        super(login);
        this.vsp = vsp;
    }
        // заявка на конвертацию
        public ConvertionRequest createRequest(ConvertData data) {
            Money from = data.getFrom();
            Currency to = data.getTo();

              double fromRate = getCurrentRate(data.getFrom().getCurrency());
              double toRate = getCurrentRate(data.getTo());

            new ConvertionRequest(from, to, fromRate, toRate);
            new ConvertionRequest(from, to, fromRate, toRate);
            new ConvertionRequest(from, to, fromRate, toRate);
            new ConvertionRequest(from, to, fromRate, toRate);
            System.out.println("ConvertionRequest.getCounter() " + new ConvertionRequest().counter);
            return new ConvertionRequest(from, to, fromRate, toRate);
        }

    // текущая ставка
        public double getCurrentRate(Currency currency) {
            double result = 1;
            switch (currency) {
                case USD:
                result = 66.45;
                break;
                case EUR:
                result = 78.12;
                break;
            }
            return result;
        }

}
