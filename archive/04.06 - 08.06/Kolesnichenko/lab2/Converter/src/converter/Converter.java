package converter;

import person.Client;
import operation.CurrencyDataBase;
import operation.MoneyType;
import operation.OperationResult;

public class Converter implements IConverter {
    private ConverterRequest request;

    public Converter(ConverterRequest request) {
        this.request = request;
    }


    @Override
    public ConvertionResult convert() {
        ConvertionResult result;
        if (checkClientData(request.getClient())) {
            System.out.println("Клиент есть"); //для проверки
            result = new ConvertionResult(OperationResult.SUCCESS, "");
        } else {
            System.out.println("Ошибка");
            result = new ConvertionResult(OperationResult.ERROR, "Нет данных (ДУЛ)");
        }

        request.setResult(result);

        if (result.getCode() == OperationResult.SUCCESS) {
            // Обращение к справочнику без логики
            //
            MoneyType outMoneyType = CurrencyDataBase.useReference(request.getCurrencyIn(), request.getCurrencyOut().getType());
            request.setCurrencyOut(outMoneyType);
        }
        return result;
    }

    public boolean checkClientData(Client client) {
        /*Проверяет, есть ли у клиента документ
        * */
        return (client.getDul() != null);
    }

}


