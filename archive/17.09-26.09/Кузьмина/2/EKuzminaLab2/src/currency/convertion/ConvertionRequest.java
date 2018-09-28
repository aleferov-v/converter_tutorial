package currency.convertion;

public class ConvertionRequest {

    public int counter; // счетчик заявок
    private Money from; // из какой валюты и какая сумма конвертируется
    private Currency to; // в какую валюту происходит конвертация
    private double fromRate; // текущий курс исходной валюты
    private double toRate; // текущий курс целевой валюты

    public ConvertionRequest() {

    }

    public ConvertionRequest(Money from, Currency to, double fromRate, double toRate) {
        this.from = from;
        this.to = to;
        this.fromRate = fromRate;
        this.toRate = toRate;
        counter++;
    }

    public Money getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getFromRate() {
        return fromRate;
    }

    public double getToRate() {
        return toRate;
    }


}
