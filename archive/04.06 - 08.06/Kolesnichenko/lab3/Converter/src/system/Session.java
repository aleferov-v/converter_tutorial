package system;

import database.CourseRate;
import person.*;
import currency.*;
import converter.*;

import java.util.HashMap;
import java.util.Map;

public class Session {


    /*
     * Главный класс программы.
     * Создание заявки (request)
     * Создание и получение клиента. Содание и получение оператора.
     * Считывание входных данных
     * Вызов конвертера converter.Converter()
     *
     * */
    public static void main(String[] args) {
        Client client = new ClientStub();
        Operator operator = new Operator();
        ConverterRequest request = new ConverterRequest(client);
        request.setCurrencyIn(CurrencyCode.RUB, -100.00);
        request.setCurrencyOut(CurrencyCode.USD, 0);

        CourseRate courseRate = createCourseRate();
        request.getCurrencyOut().setCourseRate(courseRate);
        Converter converter = new Converter(request);
        request.setResult(converter.convert());

        Printer.INSTANCE.print(request);
    }

    private static CourseRate createCourseRate() {
        CourseRate courseRate = new CourseRate();
        courseRate.setCode(CurrencyCode.USD);
        courseRate.setBuyPrice(62.25);
        courseRate.setSellPrice(63.50);
        courseRate.setRate(1);
        return courseRate;
    }
}
