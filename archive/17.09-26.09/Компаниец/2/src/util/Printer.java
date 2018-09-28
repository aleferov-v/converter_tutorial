package util;

import conversion.ConversionResult;

public class Printer {
    public static void print(ConversionResult result) {

        //Build a message
        String message = String.format("Currency exchange completed successful.\n" +
                "Money received from the client: %.2f %s\n" +
                "Currency requested: %s\n" +
                "Money given to the client: %.2f %s",
                result.moneyFrom.getAmount(),
                result.moneyFrom.getCurrency().name(),
                result.moneyTo.getCurrency().name(),
                result.moneyTo.getAmount(),
                result.moneyTo.getCurrency().name()
        );

        System.out.printf(message);
    }
}
