package lab2;

import java.util.Currency;

public class ConvertData {

    private Client client;
    private Operator operator;
    private double inputAmount;
    private String from;
    private String to;

    public ConvertData(double inputAmount, String from, String to) {
        this.inputAmount = inputAmount;
        this.from = from;
        this.to = to;
    }

    public Client getClient() {
        return client;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getInputAmount() {
        return inputAmount;
    }

    public Operator getOperator() {
        return operator;
    }
}

