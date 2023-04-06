package com.github.mrglassdanny.domsa.lang.fn.date;

import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class NowFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "date::now";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 0);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        DateFormat dateTimeFormat = new SimpleDateFormat(DateUtil.getDefaultDateTimeFormat());
        return new JsonPrimitive(dateTimeFormat.format(DateUtil.getDate()));
    }
}
