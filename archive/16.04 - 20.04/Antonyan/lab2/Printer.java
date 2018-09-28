package lab2;

public class Printer {

    private Operator operator;

    public Printer(Operator operator) {
        this.operator = operator;
    }

    public void print(ConversionResult result, Client client) {
        System.out.println("Операция обмена валюты");
        System.out.println("------------------------");
        if (result.operationResult == OPERATION_RESULT.ERR) {
            System.out.println("Ошибка: " + result.errorMessage);
        } else {
            System.out.println("Операция выполнена успешно");
            System.out.println("Клиент: " + client.getFio());
            System.out.println("Кассир: " + operator.FIO);
            System.out.println("Получено: " + result.inputAmount + " " + result.inputCurrency);
            System.out.println("Выдано: " + result.resultAmount + " " + result.resultCurrency);
            System.out.println("Курс 1 " + result.inputCurrency + " = " + result.rate + " " + result.resultCurrency);
        }
    }
}
