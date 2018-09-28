package lab4;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    /**
     * Тест_1
     * создание заявки с входной суммой, превышающей лимит для студента
     */
    @Test
    public void testStudentInputSum() {

        OperatorStudent student = new OperatorStudent(3,"FioStudent", 10_000);
        Client client1 = new Client(1,"Петров", true);
        String inputCurrency = "RUB";
        double inputAmount = 100_000;
        String resultCurrency = "USD";
        double rate = 55.55;
        ConversationRequest crequest = student.createConversionRequest(client1,inputCurrency,inputAmount,resultCurrency,rate);

        Assert.assertNull(crequest);
    }

    /**
     * Тест_2
     * создание заявки с валютами, недоступными для студента
     */
    @Test
    public void testStudentInputCurrencies() {

        OperatorStudent student = new OperatorStudent(3,"FioStudent", 10_000);
        Client client = new Client(1,"Петров", true);
        String inputCurrency = "RUB";
        double inputAmount = 10_000;
        String resultCurrency = "EUR";
        double rate = 55.55;
        ConversationRequest crequest = student.createConversionRequest(client,inputCurrency,inputAmount,resultCurrency,rate);

        Assert.assertNull(crequest);
    }
    /**
     * Тест_3
     * создание заявки по клиенту, у которого отсутствуют входные документы
     */
    @Test
    public void testStudentNullClientDocs() {

        OperatorStudent student = new OperatorStudent(3,"FioStudent", 10_000);
        Client client = new Client(1,"Петров", false);
        String inputCurrency = "RUB";
        double inputAmount = 10_000;
        String resultCurrency = "USD";
        double rate = 55.55;
        ConversationRequest crequest = student.createConversionRequest(client,inputCurrency,inputAmount,resultCurrency,rate);

        Assert.assertNull(crequest);
    }

    /**
     * Тест_4
     * создание заявки со всеми условиями, подходящими для оператора-студента
     */
    @Test
    public void testStudentAllValidConditions() {

        OperatorStudent student = new OperatorStudent(3,"FioStudent", 10_000);
        Client client = new Client(1,"Петров", true);
        String inputCurrency = "RUB";
        double inputAmount = 10000;
        String resultCurrency = "USD";
        double rate = 55.55;
        ConversationRequest crequest = student.createConversionRequest(client,inputCurrency,inputAmount,resultCurrency,rate);

        Assert.assertNotNull(crequest);
    }
}
