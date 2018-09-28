package currency;

public enum CurrencyCode {

    /**
     * Символьные коды валют и название кириллицей
     */
    RUB("Рубль"),
    EUR("Евро"),
    USD("Доллар США");

    private String description;

    CurrencyCode(String description) {
        this.description = description;
    }

    public String description() {
        return description;
    }
}
