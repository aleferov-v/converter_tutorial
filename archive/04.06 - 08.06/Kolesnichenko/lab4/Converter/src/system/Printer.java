package system;

import converter.ConvertionResult;
import converter.ResultCode;
import person.Client;

public class Printer {
    public void print(ConvertionResult result) {
        System.out.println("Результат операции: " +
                (result.getCode() == ResultCode.SUCCESS ? "УСПЕШНО" : "ОШИБКА"));
        String in = result.getCurrencyIn().getType().description();
        String out = result.getCurrencyOut().getType().description();
        System.out.println(String.format("Внесено: %.2f, валюта: %s", result.getCurrencyIn().getValue(), in));
        System.out.println(String.format("Отдано: %.2f, валюта: %s", result.getCurrencyOut().getValue(), out));
        System.out.println(String.format("Курс: %.2f", result.getCourse()));
        if (result.getMessage() != "") {
            System.out.println("Описание: " + result.getMessage());


        }

    }

    public void print(Client client) {
        System.out.println("____________________________");
        System.out.println("Данные клиента: ");
        System.out.println("ФИО: " + client.getFirstName() + " " + client.getSecondName() + " "
                + client.getSurname());

    }

}

