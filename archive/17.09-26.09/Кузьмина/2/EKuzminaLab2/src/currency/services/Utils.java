package currency.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

// вспомогательный класс, содержащий в себе так называемые утильные методы
public class Utils {

    public static Date asDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date createDateFromString(String date) {
        return Utils.asDate(LocalDate.parse(date));
    }

    public static String createStringFromDate(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        return dateFormat.format(date);
    }
}