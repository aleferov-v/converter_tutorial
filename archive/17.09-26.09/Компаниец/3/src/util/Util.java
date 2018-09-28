package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static Date convertStringToDate(String strDate) {
        Date date = null;
        SimpleDateFormat dateFormatted = new SimpleDateFormat("dd.MM.yyyy");
        try {
            date = dateFormatted.parse(strDate);
        }
        catch (ParseException ex) {
            System.err.println(ex.toString());
        }
    return date;
    }
}
