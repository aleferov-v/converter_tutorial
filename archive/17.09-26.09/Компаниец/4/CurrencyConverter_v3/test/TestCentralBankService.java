import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.CentralBankService;

public class TestCentralBankService extends BaseTest{

    @Test
    @DisplayName("Check the only one CentralBankService instance")
    public void testCentralBankServiceSingleInstance() {
        CentralBankService centralBankService1 = CentralBankService.getInstance();
        CentralBankService centralBankService2 = CentralBankService.getInstance();
        Assertions.assertSame(centralBankService1, centralBankService2);

    }

    @Test
    @DisplayName("Check that all CentralBankService constructors are hidden")
    public void testCentralBankServiceConstructorHidden() {
        Assertions.assertEquals(0, CentralBankService.class.getConstructors().length);
    }
}
