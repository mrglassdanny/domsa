package com.github.mrglassdanny.domsa.lang.fn;

import com.google.gson.JsonObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFn {

    private static final String DEFAULT_DATE_FORMAT = "MM/dd/yyyy hh:mi:ss";

    private static Date getDate() {
        return Calendar.getInstance().getTime();
    }

    public static String date() throws Exception {
        DateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        return dateFormat.format(getDate());
    }

    public static String date(String format) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(getDate());
    }

    public static String date(String format, String date) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(Date.parse(date));
    }
}
