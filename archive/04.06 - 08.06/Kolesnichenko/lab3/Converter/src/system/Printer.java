package system;
import converter.ResultCode;
import person.Client;

public class Printer{

    public static Printer INSTANCE = createInstance();

    private synchronized static Printer createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Printer();
        }
        return INSTANCE;
    }

    private Printer() {

    }

    public void print(ConverterRequest request) {
        System.out.println("Результат операции: "+
                (request.getResult().getCode()== ResultCode.SUCCESS?"УСПЕШНО":"ОШИБКА"));
        if (request.getResult().getMessage()!=""){
            System.out.println("Описание: "+request.getResult().getMessage());
        }
        String info = String.format("Результат конвертации %s %s в %s: %.2f",
                request.getCurrencyIn().getValue(),
                request.getCurrencyIn().getType(),
                request.getCurrencyOut().getType(),
                request.getCurrencyOut().getValue());


        System.out.println(info);
    }

}
