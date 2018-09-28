package util;

import conversion.ConversionResult;

/**
 * Printer class
 */
public class Printer {

    /**
     * Method for print conversion result
     */
    public static String print(ConversionResult result) {

        String message;

        if (result.getConversionStatus().isOK()) {
            //Build a message
            message = String.format("Currency exchange completed successful.\n" +
                            "Money received from the client: %.2f %s\n" +
                            "Currency requested: %s\n" +
                            "Current exchange rate: [1.00 - %.3f]\n" +
                            "Money given to the client: %.2f %s\n\n",
                    result.getMoneyFrom().getAmount(),
                    result.getMoneyFrom().getCurrency().name(),
                    result.getMoneyTo().getCurrency().name(),
                    result.getMoneyFrom().getAmount() / result.getMoneyTo().getAmount(),
                    result.getMoneyTo().getAmount(),
                    result.getMoneyTo().getCurrency().name()
            );
        } else {
            message = "Currency exchange unsuccessful.\n" +
                    "Reason: Client ID check failed.\n";
        }

        System.out.println(message);
        return message;
    }
}
