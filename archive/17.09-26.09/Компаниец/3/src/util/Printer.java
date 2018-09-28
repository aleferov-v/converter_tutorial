package util;

import conversion.ConversionResult;

public class Printer {
    public static void print(ConversionResult result) {

        String message = "";

        if (result.conversionStatus.isOK()) {
            //Build a message
            try {
                message = String.format("Currency exchange completed successful.\n" +
                                "Money received from the client: %.2f %s\n" +
                                "Currency requested: %s\n" +
                                "Current exchange rate: [1.00 - %.2f]\n" +
                                "Money given to the client: %.2f %s",
                        result.moneyFrom.getAmount(),
                        result.moneyFrom.getCurrency().name(),
                        result.moneyTo.getCurrency().name(),
                        result.moneyFrom.getAmount() / result.moneyTo.getAmount(),
                        result.moneyTo.getAmount(),
                        result.moneyTo.getCurrency().name()
                );
            } catch (NullPointerException ex) {
                ex.printStackTrace();
                System.err.println("Null money object given, program terminated!");
                System.exit(1);
            }
        } else {
            message = "Currency exchange unsuccessful.\n" +
                    "Reason: Client ID check failed.";
        }

        System.out.print(message);
    }
}
