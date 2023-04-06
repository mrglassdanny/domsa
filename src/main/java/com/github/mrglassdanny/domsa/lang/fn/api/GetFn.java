package com.github.mrglassdanny.domsa.lang.fn.api;

import com.github.mrglassdanny.domsa.client.ApiClient;
import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;

import java.util.List;

public class GetFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "api::get";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 1);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "request", args.get(0), FnArgType.JsonObject);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var req = args.get(0).getAsJsonObject();
        return ApiClient.get(req);
    }
}
