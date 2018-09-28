package stubs;

import currency.CurrencyCode;
import currency.CourseRate;
import system.NoDataException;

import java.io.IOException;
import java.util.Map;

public abstract class AbstractCourseReciever implements ICourseReciever {

    public abstract Map<CurrencyCode, CourseRate> getCourses() throws NoDataException, IOException;

    @Override
    public boolean load() {
        return false;
    }
}
