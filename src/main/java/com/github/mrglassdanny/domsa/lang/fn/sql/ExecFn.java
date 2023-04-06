package com.github.mrglassdanny.domsa.lang.fn.sql;

import com.github.mrglassdanny.domsa.client.SqlClient;
import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.List;

public class ExecFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "sql::exec";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 1);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "query", args.get(0), FnArgType.String);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var query = args.get(0).getAsString();

        var res = new JsonObject();

        res.addProperty("rowsAffected", SqlClient.exec(query));

        return res;
    }
}
