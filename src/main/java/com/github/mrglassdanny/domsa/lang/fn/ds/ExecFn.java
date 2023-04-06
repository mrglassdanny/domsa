package com.github.mrglassdanny.domsa.lang.fn.ds;

import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.lang.ds.DsRepository;
import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;

import java.util.List;

public class ExecFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "ds::exec";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 2);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "path", args.get(0), FnArgType.String);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "request", args.get(1), FnArgType.JsonObject);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var path = args.get(0).getAsString();
        var req = args.get(1).getAsJsonObject();

        var script = DsRepository.scripts.get(path);

        if (script == null) {
            throw new RuntimeException(path + ".ds does not exist");
        }

        return DomsaScriptInterpreter.exec(script, req);
    }
}
