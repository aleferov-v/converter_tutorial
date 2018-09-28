package homework.ponomariev.lab3;

import java.util.Arrays;

//import static jdk.nashorn.internal.objects.Global.print;

/**
 * Лабораторная работа № 3
 * Развитие конвертора
 *
 * @author Евгений Пономарев
 */

public class JavaLab3 {

    public static void main(String[] args) {
        Client client = DataBase.getClientById(1);
        Operator operator = DataBase.getOperatorById(2);
        Converter convert = new Converter(client, operator);

        System.out.println("Баланс кассы=" + Cashbox.getAmount("RUB") + " RUB;" + Cashbox.getAmount("USD")+ " USD");
        
        ConversionResult result = convert.convert(new ConvertionData(11_000, "RUB", "USD"));

        Printer printer = new Printer(operator);
        printer.print(result, client);

        System.out.println("Баланс кассы=" + Cashbox.getAmount("RUB") + " RUB;" + Cashbox.getAmount("USD")+ " USD");
        
        System.out.println(" ================= ");
        System.out.println("Работает студент: ");

        OperatorStudent student = new OperatorStudent(3,"", 10_000_000);
        Converter converterStudent = new Converter(client, student);
        ConversionResult resultStudent =converterStudent.convert(new ConvertionData(999.000, "RUB", "USD"));
        Printer printerStudent = new Printer(student);
        printerStudent.print(resultStudent, client);
        
        // Неуспешно для студента
        System.out.println(" ================= ");
        System.out.println("Работает студент: ");

        ConversionResult resultStudent2 =converterStudent.convert(new ConvertionData(10_000_005, "RUB", "USD"));
        Printer printerStudent2 = new Printer(student);
        printerStudent.print(resultStudent2, client);
    }

}
