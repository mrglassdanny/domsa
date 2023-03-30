package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.Environment;
import com.google.gson.JsonObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFn {

    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    private static Date getDate() {
        return Calendar.getInstance().getTime();
    }

    private static String getDefaultDateFormat() {
        String fmt = Environment.properties.get("defaultDateFormat");
        if (fmt == null) {
            fmt = DEFAULT_DATE_FORMAT;
        }
        return fmt;
    }

    public static String date() {
        DateFormat dateFormat = new SimpleDateFormat(getDefaultDateFormat());
        return dateFormat.format(getDate());
    }

    public static String date(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(getDate());
    }

    public static String formatDate(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(getDefaultDateFormat());
        return dateFormat.format(dateFormat.parse(date));
    }

    public static String formatDate(String date, String format) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateFormat.parse(date));
    }
}
