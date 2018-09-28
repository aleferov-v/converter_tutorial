package converter;

import currency.CurrencyCode;
import currency.MoneyType;
import database.CourseRate;
import system.ConverterRequest;

import java.util.Map;

public class Converter implements IConverter {


    /**
     * Заявка, с которой сессия вызывает конвертер
     */
    //private ConverterRequest request;

    /**
     * Валюта клиента, которую он хочет обменять
     */

    private MoneyType currencyIn;

    /**
     * Валюта, которую нужно выдать клиенту
     */

    private MoneyType currencyOut;


    public Converter(ConverterRequest request) {
        this.currencyIn = request.currencyIn;
        this.currencyOut = request.currencyOut;
    }

    public Converter(MoneyType currencyIn, CurrencyCode code) {
        this.currencyIn = currencyIn;
        this.currencyOut.setType(code);
    }


    /**
     *
     *
     */


    @Override
    public ConvertionResult convert() throws NoDataException {

        ConvertionResult result = new ConvertionResult();
        CourseRate courrIn;
        CourseRate courrOut;
        double value = 0.00;
        Map<CurrencyCode, CourseRate> course = new HashMap<CurrencyCode, CourseRate>();
        try {
            course = new StubCourseReciever().getCourses();
        } catch (NullPointerException e) {
            result.setMessage(e.getMessage());
            result.setCode(ResultCode.ERROR);
            return result;
        }
        courrIn = course.get(currencyIn.getType());
        courrOut = course.get(currencyOut.getType());


        result.setCurrencyIn(currencyIn);
        result.setCurrencyOut(currencyOut);

        if (currencyOut.getValue() != 0.00) {
            result.setCode(ResultCode.SUCCESS);
            result.setMessage("Обмен прошел успешно");

            return result;
        } else {
            result.setCode(ResultCode.ERROR);
            result.setMessage("Обмен не завершился");
            return result;
        }
    }

    private double getResultValue(CourseRate courrIn, CourseRate courrOut) {
        double value;
        if (currencyIn.getType() == CurrencyCode.RUB) {

            /*
             * Покупка: клиент покупает валюту "CurrencyOut" на рубли, которые принес
             *
             *outB = inB/sell/rate
             * */


            value = currencyIn.getValue() / courrOut.getSellPrice() / courrOut.getRate();
        } else if (currencyIn.getType() != CurrencyCode.RUB && currencyOut.getType() == CurrencyCode.RUB) {
            /*
             * Продажа: клиент продает валюту "CurrencyIn", CurrencyOut - рубли
             * outS = inS*buy/rate
             */
            value = currencyIn.getValue() / courrOut.getBuyPrice() / courrOut.getRate();
        } else {
            /*Конверсия(принес определенную сумму)
             * in*buyIn/sellOut/rateIn*rateOut
             */
            double cross = courrIn.getBuyPrice() / courrOut.getSellPrice();
            value = currencyIn.getValue() * cross / courrIn.getRate() * courrOut.getRate();
        }
        return value;
    }


//    public ConverterRequest getRequest() {
//        return request;
//    }
//
//    public void setRequest(ConverterRequest request) {
//        this.request = request;
//    }

    public MoneyType getCurrencyIn() {
        return currencyIn;
    }

    public void setCurrencyIn(MoneyType currencyIn) {
        this.currencyIn = currencyIn;
    }

    public MoneyType getCurrencyOut() {
        return currencyOut;
    }

    public void setCurrencyOut(MoneyType currencyOut) {
        this.currencyOut = currencyOut;
    }

}


