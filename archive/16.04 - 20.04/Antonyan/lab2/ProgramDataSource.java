package lab2;


public class ProgramDataSource implements IDataSource {


    @Override
    public ConvertData getConvertData() {
        Client client = new Client(1, "Иванов И.И.", true);

        return new ConvertData(1000, "RUB", "USD");

    }
}
