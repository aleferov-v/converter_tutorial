import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    @BeforeEach
    public void beforeEach(TestInfo testInfo)
    {
        System.out.println("----------------Starting test----------------");
        printTestHeaderToLogInfo(testInfo);
    }

    @BeforeAll
    public void beforeAll() {
        System.out.println("-------------Starting test suite-------------");
        System.out.println(this.getClass().getSimpleName());

    }

    private void printTestHeaderToLogInfo(TestInfo testInfo) {
        System.out.println("Run test: "
                + this.getClass().getSimpleName()
                + " > "
                + testInfo.getTestMethod().get().getName()
                + "\nDescription: "
                + testInfo.getDisplayName()
        );
    }
}
