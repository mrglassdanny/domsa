package com.github.mrglassdanny.domsa.lang.fn.arr;

import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;

import java.util.List;

public class FirstFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "arr::first";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 1);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "arr", args.get(0), FnArgType.JsonArray);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var arr = args.get(0).getAsJsonArray();
        return arr.get(0);
    }
}
