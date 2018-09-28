package converter;

import currency.CurrencyCode;
import currency.MoneyType;
import currency.CourseRate;
import stubs.AbstractCourseReciever;
import stubs.ICourseReciever;
import stubs.StubCourseReciever;
import system.ConverterRequest;
import system.NoDataException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Converter implements IConverter {


    /**
     * Заявка, с которой сессия вызывает конвертер
     */
    private ConverterRequest request;

    /**
     * Валюта клиента, которую он хочет обменять
     */
    private AbstractCourseReciever courceReciver;

    public Converter(ConverterRequest request, AbstractCourseReciever courceReciver) {
        this.request = request;
        this.courceReciver = courceReciver;
    }

    @Override
    public ConvertionResult convert() throws NoDataException, IOException {

        ConvertionResult result = new ConvertionResult();
        Map<CurrencyCode, CourseRate> course = courceReciver.getCourses();
        CourseRate courrIn = course.get(request.currencyIn.getType());
        CourseRate courrOut = course.get(request.currencyOut.getType());

        double resultVale = getResultValue(courrIn, courrOut, result);
        request.currencyOut.setValue(resultVale);

        result.setCurrencyIn(request.currencyIn);
        result.setCurrencyOut(request.currencyOut);
        if (request.currencyOut.getValue() != 0.00) {
            result.setCode(ResultCode.SUCCESS);
            result.setMessage("Обмен прошел успешно");

            return result;
        } else {
            result.setCode(ResultCode.ERROR);
            result.setMessage("Обмен не завершился");
            return result;
        }
    }

    private double getResultValue(CourseRate courrIn, CourseRate courrOut, ConvertionResult result) {
        double value;
        if (request.currencyIn.getType() == CurrencyCode.RUB) {

            /*
             * Покупка: клиент покупает валюту "CurrencyOut" на рубли, которые принес
             *
             *outB = inB/sell/rate
             * */


            value = request.currencyIn.getValue() / courrOut.getSellPrice() / courrOut.getRate();
            result.setCourse(courrOut.getSellPrice());
        } else if (request.currencyIn.getType() != CurrencyCode.RUB && request.currencyOut.getType() == CurrencyCode.RUB) {
            /*
             * Продажа: клиент продает валюту "CurrencyIn", CurrencyOut - рубли
             * outS = inS*buy/rate
             */
            value = request.currencyIn.getValue() / courrOut.getBuyPrice() / courrOut.getRate();
            result.setCourse(courrOut.getBuyPrice());
        } else {
            /*Конверсия(принес определенную сумму)
             * in*buyIn/sellOut/rateIn*rateOut
             */
            double cross = courrIn.getBuyPrice() / courrOut.getSellPrice();
            value = request.currencyIn.getValue() * cross / courrIn.getRate() * courrOut.getRate();
            result.setCourse(-1);
        }
        return value;
    }
}


