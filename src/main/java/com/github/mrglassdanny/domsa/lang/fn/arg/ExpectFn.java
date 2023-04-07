package com.github.mrglassdanny.domsa.lang.fn.arg;

import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;

import java.util.List;

public class ExpectFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "arg::expect";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 1);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        if (args.get(0) == null || args.get(0).isJsonNull()) {
            throw new RuntimeException(this.getFullyQualifiedName() + " failure");
        }

        return args.get(0);
    }
}
