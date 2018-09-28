import conversion.ConversionResult;
import conversion.ConvertData;
import conversion.converter.CurrencyConverter;
import conversion.datasource.FileDataSource;
import conversion.datasource.IDataSource;
import conversion.datasource.ProgrammDataSource;
import person.Operator;
import services.ManagementService;
import util.Printer;

import java.io.File;
import java.util.Scanner;

/**
 * Main converter class
 */
class Converter {
    private CurrencyConverter converter;

    private static final String FILE_DATASOURCE = "resources/clients.yaml";

    Converter() {
        this.converter = new CurrencyConverter();
    }

    void run() {

        Scanner scan = new Scanner(System.in);
        String banner = "Choose data source for conversion:\n" +
                "0 - Program data source\n" +
                "1 - File data source\n" +
                "2 - Both\n";
        System.out.printf(banner);
        int mode = scan.nextInt();

        switch (mode) {
            case 0:
                useProgramDataSource();
                break;
            case 1:
                useFileDataSource();
                break;
            case 2:
                useProgramDataSource();
                useFileDataSource();
                break;
            default:
                System.out.println("Wrong mode selected!");
        }
    }

    private void useProgramDataSource() {

        Operator operator = ManagementService.getTodayOperator();

        IDataSource dataSource = new ProgrammDataSource();
        ConvertData convertData = dataSource.getConvertData();

        ConversionResult conversionResult = converter.convert(convertData, operator);

        System.out.println("======= Converting data generated programmatically =======");
        Printer.print(conversionResult);
    }

    private void useFileDataSource() {
        Operator operator = ManagementService.getTodayOperator();
        File input = new File(FILE_DATASOURCE);

        IDataSource dataSource = new FileDataSource(input);
        ConvertData convertData = dataSource.getConvertData();

        ConversionResult conversionResult = converter.convert(convertData, operator);

        System.out.println("======= Converting data from file datasource =======");
        Printer.print(conversionResult);

    }
}
