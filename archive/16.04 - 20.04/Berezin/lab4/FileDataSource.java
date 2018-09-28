package lab4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FileDataSource implements IDataSource {

    private File file;

    public FileDataSource(File file) {
        this.file = file;
    }

    @Override
    public ConvertionData getConvertionData() {

        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file.getPath()))) {

            StringBuilder sb = new StringBuilder();
            int i = -1;
            while ((i = br.read()) != -1) {
                sb.append((char) i);
            }

            String[] columns = sb.toString().split(",");
            int id = Integer.parseInt(columns[0]);
            String fio = columns[1];
            boolean isExistDocument = columns[2].equalsIgnoreCase("true");

            Client client = new Client(id, fio, isExistDocument);

            double inputAmount = Double.parseDouble(columns[3]);
            String inputCurrency = columns[4];
            String resultCurrency = columns[5].replaceAll("\r\n","");

            return new ConvertionData(client, inputAmount, inputCurrency, resultCurrency);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
