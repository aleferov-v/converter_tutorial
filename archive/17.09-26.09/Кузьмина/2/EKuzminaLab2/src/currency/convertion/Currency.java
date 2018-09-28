package currency.convertion;

// валюта
public enum Currency {
    RUB ("Российский рубль"),
    USD ("Доллар США"),
    EUR ("Евро");

    private String description;

        Currency(String description){
        this.description = description;
        }
}
