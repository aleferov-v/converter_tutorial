package currency.convertion;

import currency.person.Client;

// данные для конвертации
public class ConvertData {

    private Client client; // данные о клиенте, который совершает конвертацию
    private Money from; // валюта
    private Currency to; // кол-во денег

    public ConvertData(Client client, Money from, Currency to){
        this.client = client;
        this.from = from;
        this.to = to;
    }

    public Client getClient() {
        return client;
    }

    public Money getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }
}

