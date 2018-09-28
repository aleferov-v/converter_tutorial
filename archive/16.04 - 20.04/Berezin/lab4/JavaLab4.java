package lab4;

//import java.util.Arrays;

//import static jdk.nashorn.internal.objects.Global.print;

import java.io.File;


public class JavaLab4 {

    public static void main(String[] args) {
        IDataSource fileDSOperator = new FileDataSource(new File("resources/testOperator.csv"));
        Operator operator = DataBase.getOperatorById(2);
        Converter convert = new Converter(operator);

        double rubAmountBefore = Cashbox.getAmount("RUB");
        double usdAmountBefore = Cashbox.getAmount("USD");

        System.out.printf("Баланс кассы = %,.2f RUB; %,.2f USD\n", rubAmountBefore, usdAmountBefore);

        ConversionResult result = convert.convert(fileDSOperator.getConvertionData());

        Printer printer = new Printer(operator);
        printer.print(result, fileDSOperator.getConvertionData().getClient());

        double rubAmountAfter = Cashbox.getAmount("RUB");
        double usdAmountAfter = Cashbox.getAmount("USD");

        System.out.printf("Баланс кассы = %,.2f RUB; %,.2f USD\n", rubAmountAfter, usdAmountAfter);
        
        System.out.println(" ================= ");
        System.out.println("Работает студент: ");

        IDataSource fileDSStudent = new FileDataSource(new File("resources/testStudent.csv"));
        try {

            OperatorStudent student = new OperatorStudent(3,"FioStudent", 10_000_000);
            Converter converterStudent = new Converter(student);
            ConversionResult resultStudent = converterStudent.convert(fileDSStudent.getConvertionData());
            Printer printerStudent = new Printer(student);
            printerStudent.print(resultStudent, fileDSStudent.getConvertionData().getClient());
        }
        catch (ConversionException c) {
            c.printStackTrace();
        }
        catch (PrintException p) {
            p.printStackTrace();
        }

        System.out.println("Завершение работы программы...");
    }

}
