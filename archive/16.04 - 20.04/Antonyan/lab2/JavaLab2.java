package lab2;

/**
 * Лабораторная работа № 2
 * создание конвертера валют
 *
 * @author Евгений Пономарев
 */

public class JavaLab2 {

    public static void main(String[] args) {
        Client client = createClient(1);
        Operator operator = new Operator(2);
        Converter convert = new Converter(client, operator);
        ConvertData data = new ConvertData(10000,"RUB","USD");

        ConversionResult result = convert.convert(data);

        Printer printer = new Printer(operator);
        printer.print(result, client);

        System.out.println(" ================= ");
        System.out.println("Работает студент: ");

        Operator student = new OperatorStudent(3);
        Converter converterStudent = new Converter(client, student);
        ConversionResult resultStudent =converterStudent.convert(data);
        Printer printerStudent = new Printer(student);
        printerStudent.print(resultStudent, client);

        if (operator instanceof TestSerializable) {
            doWrite();
        }
        if (student instanceof TestSerializable) {
            doWrite();
        }

        System.out.println("Количество заявок: ");
        System.out.println();

        new ConversationRequest();
        new ConversationRequest();
        new ConversationRequest();
        System.out.println(ConversationRequest.count);
    }

    private static void doWrite() {
    }

    private static Client createClient(int id) {
        int clientId = -1;
        String FIO = "";
        boolean isExistDocument = false;
        Client result = null;

        for (int i = 0; i < DataBase.CLIENTS[0].length; i++) {
            if (id == Integer.parseInt(DataBase.CLIENTS[0][i])) {
                clientId = Integer.parseInt(DataBase.CLIENTS[0][i]);
                FIO = DataBase.CLIENTS[1][i];
                isExistDocument = Boolean.parseBoolean(DataBase.CLIENTS[2][i]);
                break;
            }
        }

        if (clientId > 0) {
            result = new Client(clientId, FIO, isExistDocument);
        }
        return result;
    }
}
