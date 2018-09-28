package stubs;

import currency.CurrencyCode;
import currency.CourseRate;
import system.NoDataException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCourseReciever extends AbstractCourseReciever {

    private String path;

    public FileCourseReciever(String path) {
        this.path = path;
    }

    @Override
    public Map<CurrencyCode, CourseRate> getCourses() throws NoDataException, IOException {
        if (path == null) {
            throw new NoDataException("Невозможно получить данные: не указан путь");
        }

        Map<CurrencyCode, CourseRate> map = new HashMap<CurrencyCode, CourseRate>();
        try (FileReader reader = new FileReader(path)) {
            Scanner scanner = getScanner(reader);

            String data = "";

            while (scanner.hasNextLine()) {
                CourseRate courseRate = new CourseRate();

                data = (scanner.nextLine()); //type buy sell rate

                String buy = readNext(data);
                courseRate.setBuyPrice(Double.valueOf(buy));
                data = reduceData(data);

                String sell = readNext(data);
                courseRate.setSellPrice(Double.valueOf(sell));
                data = reduceData(data);

                String rate = readNext(data);
                courseRate.setRate(Integer.valueOf(rate));
                data = reduceData(data);

                String currency = readNext(data);
                CurrencyCode currencyCode = CurrencyCode.valueOf(currency);

                map.put(currencyCode, courseRate);
            }
        }
        return map;
    }

    private Scanner getScanner(FileReader reader) throws FileNotFoundException {
        return new Scanner(reader);
    }

    private String readNext(String data) {
        return data.substring(0, data.indexOf(",")).trim();
    }

    private String reduceData(String data) {
        return data.substring(data.indexOf(",")+1, data.length());
    }
}
