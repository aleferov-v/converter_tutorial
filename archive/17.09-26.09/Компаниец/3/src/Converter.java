import conversion.ConversionResult;
import conversion.ConvertData;
import conversion.Currency;
import conversion.converter.CurrencyConverter;
import conversion.datasource.IDataSource;
import conversion.datasource.ProgrammDataSource;
import person.Operator;
import services.ManagementService;
import util.Printer;

public class Converter {
    private CurrencyConverter converter;
    private Printer printer;

    Converter() {
        this.converter = new CurrencyConverter();
        this.printer = new Printer();
    }

    public void run() {

        Operator operator = ManagementService.getTodayOperator();

        IDataSource dataSource = new ProgrammDataSource();
        ConvertData convertData = dataSource.getConvertData();

        ConversionResult conversionResult = converter.convert(convertData, operator);

        Printer.print(conversionResult);
    }
}
