package conversion.datasource;

import conversion.ConvertData;
import conversion.Currency;
import conversion.Money;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.error.YAMLException;
import person.Client;
import person.DUL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * Class that implements data source interface
 * Prepare ConvertData object with a YAML formatted data source file
 */
public class FileDataSource implements IDataSource {

    // Pointer to a data source file
    private File file;

    public FileDataSource(File file) {
        this.file = file;
    }

    /**
     * Method implements prepare ConvertData result from deserialized datasource
     * @return ConvertData object
     */
    @Override
    @SuppressWarnings("uncheked")
    public ConvertData getConvertData() {

        HashMap<String, Object> yamlMap = deserializeYamlDataSource(file);

        Client client = null;
        Money moneyFrom = null;
        Currency currencyTo = null;

        // Parse deserialized object
        try {
            HashMap<String, Object> _dul = (HashMap<String, Object>) yamlMap.get("DUL");
            DUL document = createDocument(
                    _dul.get("Type").toString(),
                    _dul.get("Serial").toString(),
                    _dul.get("Number").toString(),
                    _dul.get("Code").toString(),
                    _dul.get("Date").toString());

            HashMap<String, String> _clientdata = (HashMap<String, String>) yamlMap.get("FIO");
            client = createClient(_clientdata.get("FIO"), _clientdata.get("Birthdate"), document);

            HashMap<String, Object> _moneyfrom = (HashMap<String, Object>) yamlMap.get("MoneyFrom");
            moneyFrom = createMoney(Currency.valueOf(_moneyfrom.get("Currency").toString()), (Double) _moneyfrom.get("Amount"));

            HashMap<String, String> _moneyto = (HashMap<String, String>) yamlMap.get("MoneyTo");
            currencyTo = Currency.valueOf(_moneyto.get("Currency"));
        } catch (ClassCastException ex) {
            System.err.println("Attribute have a wrong or malformed value, check your datasource!");
            ex.printStackTrace();
            System.exit(1);
        } catch (Exception ex) {
            System.err.println("Something going wrong!");
            ex.printStackTrace();
            System.exit(1);
        }

        return new ConvertData(client, moneyFrom, currencyTo);
    }

    /**
     * YAML data source file deserializer
     * @param file Data source file
     * @return List of object in HashMap representation
     */
    private HashMap<String, Object> deserializeYamlDataSource (File file) {

        HashMap<String, Object> yamlMap = new HashMap<String, Object>();

        try {
            InputStream input = new FileInputStream(file);
            Yaml yaml = new Yaml();
            yamlMap = yaml.load(input);
        } catch (FileNotFoundException ex)
        {
            System.err.println("Data source file not found!");
            ex.printStackTrace();
            System.exit(1);
        } catch (YAMLException ex) {
            System.err.println("Data source file is not a valid YAML file!");
            ex.printStackTrace();
            System.exit(1);
        } catch (Exception ex) {
            System.err.println("Something going wrong, see details below!");
            ex.printStackTrace();
            System.exit(1);
        }

        return yamlMap;
    }
}
