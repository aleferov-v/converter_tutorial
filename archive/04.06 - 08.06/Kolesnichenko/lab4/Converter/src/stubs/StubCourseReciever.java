package stubs;

import currency.CurrencyCode;
import currency.CourseRate;

import java.util.HashMap;
import java.util.Map;

public class StubCourseReciever extends AbstractCourseReciever {

    @Override
    public Map<CurrencyCode, CourseRate> getCourses() {
        Map<CurrencyCode, CourseRate> stub = new HashMap<CurrencyCode, CourseRate>();
        for (CurrencyCode code : CurrencyCode.values()) {
            if (code == CurrencyCode.USD) {
                stub.put(code, new CourseRate(60.00, 62.00, 1));
            } else if (code == CurrencyCode.EUR) {
                stub.put(code, new CourseRate(70.00, 72.00, 1));
            } else {
                stub.put(code, new CourseRate(50.00, 52.00, 10));
            }
        }
        return stub;
    }
}
