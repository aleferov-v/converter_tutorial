package currency.convertion;

import currency.person.Operator;

// интерфейс
public interface CurrencyConverter {

    ConvertionResult convert(ConvertData data, Operator operator);

}
