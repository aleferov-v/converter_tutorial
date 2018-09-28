package lab4;

class Converter implements IConverter {

    private Operator operator;

    Converter(Operator operator) {

        this.operator = operator;
    }

    @Override
    public ConversionResult convert(ConvertionData data) {
        ConversionResult returnValue = new ConversionResult();
        String errorMessage = validate(data);
        if (errorMessage != null) {
            returnValue.setOperationResult(OPERATION_RESULT.ERR);
            returnValue.setErrorMessage(errorMessage);
        } else {
            CentralBankService cbService = new CentralBankService();
            double rate = cbService.getCurrentRate(data.getInputCurrency(), data.getResultCurrency());
            ConversationRequest convRequest =
                    operator.createConversionRequest(
                            data.getClient(), data.getInputCurrency(),
                            data.getInputAmount(),
                            data.getResultCurrency(), rate);
            if (convRequest != null) {
                double resultAmount = convRequest.getRate() * data.getInputAmount();
                returnValue.setOperationResult(OPERATION_RESULT.SUCCESS);
                returnValue.setInputAmount(data.getInputAmount());
                returnValue.setInputCurrency(data.getInputCurrency());
                returnValue.setRate(rate);
                returnValue.setResultAmount(resultAmount);
                returnValue.setResultCurrency(data.getResultCurrency());
                Cashbox.BalanceDown(data.getResultCurrency(), resultAmount);
                Cashbox.BalanceUP(data.getInputCurrency(), data.getInputAmount());
            } else {
                returnValue.setOperationResult(OPERATION_RESULT.ERR);
                returnValue.setErrorMessage("Заявка не была создана");
            }
        }

        return returnValue;
    }

    private String validate(ConvertionData data) {
        String errorMessage = null;
        if (!operator.checkClientExisting(data.getClient())) {
            errorMessage = "Клиент отсутствует в базе данных";
        } else if (data.getInputAmount() < 0) {
            errorMessage = "Входная сумма меньше нуля";
        }
        return errorMessage;
    }
}
