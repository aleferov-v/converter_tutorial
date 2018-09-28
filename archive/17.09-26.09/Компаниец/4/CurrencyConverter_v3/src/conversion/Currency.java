package conversion;

/**
 * Available currencies
 */
public enum Currency {

    USD("U.S. Dollar"),
    EUR("Euro"),
    GBP("U.K. Pound"),
    RUB("Russian rouble");

    private String description;

    Currency(String description) {
        this.description = description;
    }

}
