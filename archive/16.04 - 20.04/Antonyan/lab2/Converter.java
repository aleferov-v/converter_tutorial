
package lab2;

class Converter implements IConverter {
    private Client client;
    private Operator operator;

    Converter(Client client, Operator operator) {
        this.client = client;
        this.operator = operator;
    }

    @Override
    public ConversionResult convert(ConvertData data) {
        ConversionResult returnValue = new ConversionResult();
        String errorMessage = validate(data.getInputAmount());
        if (errorMessage != null) {
            returnValue.setOperationResult(OPERATION_RESULT.ERR);
            returnValue.setErrorMessage(errorMessage);
        } else {
            CentralBankService cbService = new CentralBankService();
            double rate = cbService.getCurrentRate(data.getFrom(), data.getTo());
            ConversationRequest convRequest = operator.createConversionRequest(
                    client, data.getFrom(), data.getInputAmount(), data.getTo(), rate);
            if (convRequest != null && (data.getFrom().equals("RUB") ||data.getFrom().equals("USD") || data.getFrom().equals("EUR"))
                    &&(data.getTo().equals("RUB") ||data.getTo().equals("USD") || data.getTo().equals("EUR"))) {
                double resultAmount = convRequest.getRate() * data.getInputAmount();
                if (resultAmount < getCashbox(data)) {
                    returnValue.setOperationResult(OPERATION_RESULT.SUCCESS);
                    returnValue.setInputAmount(data.getInputAmount());
                    returnValue.setInputCurrency(data.getFrom());
                    returnValue.setRate(rate);
                    returnValue.setResultAmount(resultAmount);
                    returnValue.setResultCurrency(data.getTo());
                    setCashboxTo(data, -resultAmount);
                    setCashboxFrom(data, data.getInputAmount());

                } else {
                    returnValue.setOperationResult(OPERATION_RESULT.ERR);
                    returnValue.setErrorMessage("Необходимой суммы нет в кассе");
                }
            } else {
                returnValue.setOperationResult(OPERATION_RESULT.ERR);
                returnValue.setErrorMessage("Заявка не была создана");
            }
        }

        return returnValue;
    }

    private String validate(double inputAmount) {
        String errorMessage = null;
        if (!operator.checkClientExisting(client)) {
            errorMessage = "Клиент отсутствует в базе данных";
        } else if (!operator.checkDocument(client)) {
            errorMessage = "У клиента отсутствуют документы";
        } else if (inputAmount < 0) {
            errorMessage = "Входная сумма меньше нуля";
        }
        return errorMessage;
    }

    public double getCashbox(ConvertData data) {
        Cashbox cashbox = new Cashbox();
        double result = 0;
        switch (data.getTo()) {
            case "USD":
                result = cashbox.getDollars();
                break;
            case "EUR":
                result = cashbox.getEuros();
                break;
            case "RUB":
                result = cashbox.getRoubles();
                break;
        }
        return result;
    }

    public void setCashboxTo(ConvertData data, double resultAmount) {
        Cashbox cashbox = new Cashbox();
        switch (data.getTo()) {
            case "USD":
                cashbox.setDollars(resultAmount);
                break;
            case "EUR":
                 cashbox.setEuros(resultAmount);
                break;
            case "RUB":
                cashbox.setRoubles(resultAmount);
                break;
        }

    }

    public void setCashboxFrom(ConvertData data, double resultAmount) {
        Cashbox cashbox = new Cashbox();
        switch (data.getFrom()) {
            case "USD":
                cashbox.setDollars(resultAmount);
                break;
            case "EUR":
                cashbox.setEuros(resultAmount);
                break;
            case "RUB":
                cashbox.setRoubles(resultAmount);
                break;
        }

    }
}
