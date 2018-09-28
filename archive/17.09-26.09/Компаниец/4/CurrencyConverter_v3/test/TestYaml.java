import conversion.Currency;
import conversion.Money;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.Yaml;
import conversion.ConvertData;
import person.Client;
import person.DUL;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestYaml {
    static String filename = "resources/clients.yaml";

    @Test
    public void getObject() {
        Client client;
        DUL document;
        Money moneyFrom;
        String moneyTo;

        try {
            InputStream input = new FileInputStream(new File(filename));
            Yaml yaml = new Yaml();
//            System.out.println(yaml.load(input).toString());

//            Map<String, Object> yamlMap = (Map<String, Object>) yaml.load(input);
            HashMap<String, Object> yamlMap = yaml.load(input);

//            System.out.println(yamlMap.get("DUL").toString());
//            for (String)

//            Map<String, String> dul = (Map<String, String>) yamlMap.get("DUL");
//            DUL dul = (DUL) yamlMap.get("DUL");
//            HashMap<String, String> dul = (HashMap<String, String>) yamlMap.get("DUL");
//            HashMap<String, String> dul = (HashMap<String, String>) yamlMap.get("DUL");
//            System.out.println(dul.toString());
//            System.out.println(dul.get("Type"));
            for (HashMap.Entry<String, Object> section: yamlMap.entrySet()) {

                switch (section.getKey()) {
                    case "DUL":
                        HashMap<String, String> _dul = (HashMap<String, String>) section.getValue();
//                        DUL document = createDocument(_dul.get("Type"), _dul.get("Serial"), _dul.get("Number"), _dul.get("Code"), _dul.get("Date"));
                        System.out.println(_dul.entrySet());
                        break;
                    case "FIO":
                        HashMap<String, String> _clientdata = (HashMap<String, String>) section.getValue();
//                    Client client = createClient(_clientdata.get("FIO"), _clientdata.get("birthdate"), document);
                        System.out.println(_clientdata.entrySet());
                        break;
                    case "MoneyFrom":
                        HashMap<String, String> _moneyfrom = (HashMap<String, String>) section.getValue();
//                        Money moneyFrom = createMoney(Currency.valueOf(_moneyfrom.get("Currency")), Double.valueOf(_moneyfrom.get("Amount")));
                        System.out.println(_moneyfrom.entrySet());
                        break;
                    case "MoneyTo":
                        HashMap<String, String> _moneyto = (HashMap<String, String>) section.getValue();
                        Currency currencyTo = Currency.valueOf(_moneyto.get("Currency"));
                        System.out.println(currencyTo);
                        break;

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
