package currency.convertion;

// результ конвертации
public class ConvertionResult {

    private final Money fromMoney; // деньги, из которых производилась конвертация
    private final Money toMoney; // деньги, в которые производилась конвертация

    public ConvertionResult(Money fromMoney, Money toMoney) {
        this.fromMoney = fromMoney;
        this.toMoney = toMoney;
    }

    public Money getFromMoney() {
        return fromMoney;
    }

    public Money getToMoney() {
        return toMoney;
    }
}
