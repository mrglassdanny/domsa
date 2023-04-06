package com.github.mrglassdanny.domsa.lang.fn.str;

import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

import java.util.List;

public class LenFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "str::len";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 1);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "str", args.get(0), FnArgType.String);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var str = args.get(0).getAsString();
        return new JsonPrimitive(str.length());
    }
}
