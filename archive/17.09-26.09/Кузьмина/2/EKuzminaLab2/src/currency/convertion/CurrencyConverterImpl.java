package currency.convertion;

import currency.person.Operator;

// класс реализующий интерфейс
public class CurrencyConverterImpl implements CurrencyConverter {

        @Override
        public ConvertionResult convert(ConvertData data, Operator operator) {
            ConvertionRequest request = operator.createRequest(data);
            double result = (request.getFrom().getAmount() * request.getFromRate()) / request.getToRate();
            Money resultMoney = new Money(request.getTo(), result);
            Money from = request.getFrom();
            return new ConvertionResult(from, resultMoney);
        }

}
