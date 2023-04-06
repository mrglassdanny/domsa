package com.github.mrglassdanny.domsa.lang.fn.date;

import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class FormatFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "date::format";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 2);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "format", args.get(0), FnArgType.String);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "date", args.get(1), FnArgType.String);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var fmt = args.get(0).getAsString();
        var dte = args.get(1).getAsString();

        DateFormat dateFormat = new SimpleDateFormat(fmt);
        return new JsonPrimitive(dateFormat.format(dateFormat.parse(dte)));
    }
}
