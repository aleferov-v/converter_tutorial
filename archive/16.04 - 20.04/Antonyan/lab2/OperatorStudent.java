package lab2;

public class OperatorStudent extends Operator implements TestSerializable {


    public OperatorStudent(int id) {
        super(id);
    }

    @Override
    public ConversationRequest createConversionRequest(Client client, String inputCurrency, double inputAmount, String resultCurrency, double rate) {
        if (inputAmount < 10_000_000 && inputCurrency=="RUB" && resultCurrency=="USD") {
            return super.createConversionRequest(client, inputCurrency, inputAmount, resultCurrency, rate);
        }
        return null;
    }


}
