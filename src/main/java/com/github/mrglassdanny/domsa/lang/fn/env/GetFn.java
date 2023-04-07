package com.github.mrglassdanny.domsa.lang.fn.env;

import com.github.mrglassdanny.domsa.Environment;
import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

import java.util.List;

public class GetFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "env::get";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 1);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "property", args.get(0), FnArgType.String);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var prop = args.get(0).getAsString();
        return new JsonPrimitive(Environment.get(prop));
    }
}
