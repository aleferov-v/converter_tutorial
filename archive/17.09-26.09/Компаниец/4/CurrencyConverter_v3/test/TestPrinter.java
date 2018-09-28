import conversion.ConversionResult;
import conversion.ConversionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.Printer;

public class TestPrinter extends BaseTest{

    @Test
    @DisplayName("Check print method with conversion error")
    public void testPrinterWithBadConversionStatus() {
        ConversionStatus conversionStatus = new ConversionStatus(ConversionStatus.ERR, "Something wrong!");
        ConversionResult conversionResult = new ConversionResult(null, null, conversionStatus);
        System.out.println("Printer.print() output:");
        String result = Printer.print(conversionResult);

        Assertions.assertTrue(result.contains("Reason: Client ID check failed"));
    }

    @Test
    @DisplayName("Check print method with no money given")
    public void testPrinterWithNullMoneyGiven() {
        ConversionStatus conversionStatus = new ConversionStatus(ConversionStatus.OK, "Conversion successful.");
        ConversionResult conversionResult = new ConversionResult(null, null, conversionStatus);
        Assertions.assertThrows(NullPointerException.class, () -> Printer.print(conversionResult));
        System.out.println("NullPointerException was handled.");
    }
}

