package com.github.mrglassdanny.domsa.lang.fn.str;

import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

import java.util.List;

public class ConcatFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "str::concat";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 2);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "str1", args.get(0), FnArgType.String);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "str2", args.get(1), FnArgType.String);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var str1 = args.get(0).getAsString();
        var str2 = args.get(1).getAsString();
        return new JsonPrimitive(str1 + str2);
    }
}
