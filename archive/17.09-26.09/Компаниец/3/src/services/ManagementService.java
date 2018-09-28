package services;

import person.Operator;

import java.util.Calendar;
import java.util.TimeZone;

public class ManagementService {

    public static Operator getTodayOperator() {

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String login, vsp;

        if (dayOfWeek % 2 == 0)  {
            login = "ALPHA\\Sidoroff1-SS";
            vsp = "1234/113";
        } else {
            login = "SIGMA\\23467244";
            vsp = "5678/900";
        }

        return new Operator(login, vsp);
    }
}
