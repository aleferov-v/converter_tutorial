package operation;

public enum CurrencyType {
    RUB( "Рубль"),
    EUR( "Евро"),
    USD( "Доллар США");

    private String description;

    CurrencyType(String description) {
        this.description = description;
    }
    public String description(){
        return description;
    }
}
