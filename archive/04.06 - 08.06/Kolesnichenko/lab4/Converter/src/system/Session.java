package system;

import converter.Converter;
import converter.ConvertionResult;
import converter.OperationStatus;
import converter.ResultCode;
import currency.CourseRate;
import currency.CurrencyCode;
import person.CheckingClient;
import person.Client;
import stubs.ClientExtractProcessing;
import stubs.FileCourseReciever;
import stubs.InitRequestProcessing;
import stubs.StubCourseReciever;

import java.io.IOException;
import java.util.Map;

/**
 * Главный класс программы.
 * Создание заявки (request)
 * Создание и получение клиента. Содание и получение оператора.
 * Считывание входных данных
 * Вызов конвертера converter.Converter()
 */
public class Session {

    /**
     * Идентификатор клиента
     */
    static private String id;

    static private OperationStatus checkingClient;

    static private ConvertionResult result = new ConvertionResult();

    public static void main(String[] args) throws IOException, NoDataException {

        id = "0001";


//        MoneyType currencyIn;
//
//        MoneyType currencyOut;
        Printer printer = new Printer();

        try {
            Client client = new ClientExtractProcessing().createClientDataStub();
            checkingClient = new CheckingClient(client).checkClientDul();
            if (checkingClient.getCode() == ResultCode.ERROR) {
                result.setCode(checkingClient.getCode());
                throw new Exception(checkingClient.getMessage());
            } else {
                result.setCode(checkingClient.getCode());
            }
        } catch (Exception e) {
            printer.print(result);
        }

        // From stub
        //
        System.out.println("\nДанные из заглушки:");
        ConverterRequest request = new InitRequestProcessing().initRequestStub(id);  //инициализация заявки через stub
        Converter converter = new Converter(request, new StubCourseReciever());
        try {
            result = converter.convert();
        } catch (NoDataException e) {
            e.printStackTrace();

        }
        printer.print(result);

        // From file
        //

        System.out.println("\nДанные из файла:");
        FileCourseReciever fileCourseReciever = new FileCourseReciever("./textFiles/courseRate_today.txt");
        ConverterRequest request2 = new InitRequestProcessing().initRequestStub(id);  //инициализация заявки через stub
        Converter converter2 = new Converter(request2, fileCourseReciever);
        try {
            result = converter2.convert();
        } catch (NoDataException e) {
            e.printStackTrace();

        }
        printer.print(result);

    }
}
