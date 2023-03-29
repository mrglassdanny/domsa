package com.github.mrglassdanny.domsa.lang.fn.util;

import com.github.mrglassdanny.domsa.lang.fn.DomsaFn;
import com.google.gson.JsonObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFn implements DomsaFn {
    @Override
    public JsonObject exec(JsonObject req) throws Exception {
        var res = new JsonObject();

        String fmt = req.get("format").getAsString();

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat(fmt);
        String strDate = dateFormat.format(date);

        res.addProperty("data", strDate);

        return res;
    }
}
