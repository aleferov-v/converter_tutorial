package homework.ponomariev.lab3;

public class OperatorStudent extends Operator {

    private final int maximumSum;

    public OperatorStudent(int id, String fio, int maximumSum) {
        super(id,fio);
        this.maximumSum = maximumSum;
    }

    @Override
    public ConversationRequest createConversionRequest(Client client, String inputCurrency, double inputAmount, String resultCurrency, double rate) {
        System.out.println("Student , sum="+inputAmount);
        if (inputAmount <= maximumSum
                && 
                inputCurrency=="RUB" 
                && 
                resultCurrency=="USD")  {
            return super.createConversionRequest(client, inputCurrency, inputAmount, resultCurrency, rate);
        } else return null;
    }
}
