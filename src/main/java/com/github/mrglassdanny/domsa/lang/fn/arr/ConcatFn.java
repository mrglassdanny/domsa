package com.github.mrglassdanny.domsa.lang.fn.arr;

import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.List;

public class ConcatFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "arr::concat";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 2);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "arr1", args.get(0), FnArgType.JsonArray);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "arr2", args.get(1), FnArgType.JsonArray);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var arr1 = args.get(0).getAsJsonArray();
        var arr2 = args.get(1).getAsJsonArray();

        var res = new JsonArray();
        res.addAll(arr1);
        res.addAll(arr2);

        return res;
    }
}
