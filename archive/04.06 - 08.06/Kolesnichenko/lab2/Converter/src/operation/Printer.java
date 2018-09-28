package operation;

import converter.ConverterRequest;
import converter.ConvertionResult;
import person.Client;

public class Printer{
    Printer(ConverterRequest request){

        System.out.println("Результат операции: "+
                (request.getResult().getCode()== OperationResult.SUCCESS?"УСПЕШНО":"ОШИБКА"));
        if (request.getResult().getMessage()!=""){
        System.out.println("Описание: "+request.getResult().getMessage());

        }

    }

    Printer (Client client){
        System.out.println("____________________________");
        System.out.println("Данные клиента: ");
        System.out.println("ФИО: "+client.getFirstName()+" "+client.getSecondName()+" "
        + client.getSurname());
    }

    public Printer(ConverterRequest request, ConvertionResult result) {
        System.out.println("Результат операции: "+
                (request.getResult().getCode()==OperationResult.SUCCESS?"УСПЕШНО":"ОШИБКА"));
        if (request.getResult().getMessage()!=""){
            System.out.println("Описание: "+request.getResult().getMessage());

        }
    }
}
