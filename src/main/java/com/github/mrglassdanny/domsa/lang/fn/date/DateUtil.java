package com.github.mrglassdanny.domsa.lang.fn.date;

import com.github.mrglassdanny.domsa.Environment;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    public static Date getDate() {
        return Calendar.getInstance().getTime();
    }

    public static String getDefaultDateFormat() {
        String fmt = Environment.get("defaultDateFormat");
        if (fmt == null) {
            fmt = DEFAULT_DATE_FORMAT;
        }
        return fmt;
    }

    public static String getDefaultDateTimeFormat() {
        String fmt = Environment.get("defaultDateTimeFormat");
        if (fmt == null) {
            fmt = DEFAULT_DATE_TIME_FORMAT;
        }
        return fmt;
    }
}
