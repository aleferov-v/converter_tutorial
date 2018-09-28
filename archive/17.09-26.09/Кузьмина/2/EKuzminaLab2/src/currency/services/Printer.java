package currency.services;

import currency.convertion.ConvertionResult;
import currency.convertion.Money;

// класс, отвечающий за вывод информации на печать
public class Printer {

 public void print(ConvertionResult result) {
        Money from = result.getFromMoney();
        Money to = result.getToMoney();

        System.out.println("Обмен валюты произведен успешно.");
        System.out.printf("Получено от клиента: %.2f %s\n", from.getAmount(), from.getCurrency());
        System.out.printf("Необходимо перевести в валюту: %s\n", to.getCurrency());
        System.out.printf("Отдано клиенту: %.2f %s\n", to.getAmount(), to.getCurrency());
    }

}
