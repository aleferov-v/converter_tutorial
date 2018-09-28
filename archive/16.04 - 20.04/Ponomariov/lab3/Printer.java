package homework.ponomariev.lab3;

public class Printer {

    private Operator operator;

    public Printer(Operator operator) {
        this.operator = operator;
    }

    public void print(ConversionResult result, Client client) {
        System.out.println("Операция обмена валюты");
        System.out.println("------------------------");
        if (result.getOperationResult() == OPERATION_RESULT.ERR) {
            System.out.println("Ошибка: " + result.getErrorMessage());
        } else {
            System.out.println("Операция выполнена успешно");
            System.out.println("Клиент: " + client.getFio());
            System.out.println("Кассир: " + operator.getFio());
            System.out.println("Получено: " + result.getInputAmount() + " " + result.getInputCurrency());
            System.out.println("Выдано: " + result.getResultAmount() + " " + result.getResultCurrency());
            System.out.println("Курс 1 " + result.getInputCurrency() + " = " + result.getRate() + " " + result.getResultCurrency());
        }
    }
}
