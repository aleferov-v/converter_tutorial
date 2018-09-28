package lab4;

public class OperatorStudent extends Operator {

    private final int maximumSum;

    public OperatorStudent(int id, String fio, int maximumSum) {
        super(id,fio);
        this.maximumSum = maximumSum;
    }

    @Override
    public ConversationRequest createConversionRequest(Client client, String inputCurrency, double inputAmount, String resultCurrency, double rate) {
        if (inputCurrency.isEmpty() || client.getFio().isEmpty()) {
            throw new ConversionException("Конвертация не возможна, т.к. исходная валюта или фамилия клиента отсутствуют");
        }
        if (!client.getExistDocument()) {
            System.out.println("Документ отсутствует");
            return null;
        }
        if (inputAmount <= maximumSum && inputCurrency.equalsIgnoreCase("RUB") && resultCurrency.equalsIgnoreCase("USD"))
        {
            return super.createConversionRequest(client, inputCurrency, inputAmount, resultCurrency, rate);
        }
        return null;
    }
}

