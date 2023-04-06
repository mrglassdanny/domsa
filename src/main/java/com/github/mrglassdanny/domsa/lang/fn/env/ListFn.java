package com.github.mrglassdanny.domsa.lang.fn.env;

import com.github.mrglassdanny.domsa.Environment;
import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.List;

public class ListFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "env::list";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 0);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var props = new JsonObject();

        for (var entry : Environment.properties.entrySet()) {
            props.addProperty(entry.getKey(), entry.getValue());
        }

        return props;
    }
}
