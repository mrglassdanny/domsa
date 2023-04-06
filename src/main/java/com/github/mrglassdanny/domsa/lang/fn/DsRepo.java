package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.lang.DomsaScriptRepository;
import com.google.gson.JsonObject;

public class DsRepo {

    public static JsonObject exec(String name, JsonObject req) throws Exception {
        var script = DomsaScriptRepository.scripts.get(name);
        if (script == null) {
            throw new RuntimeException("'" + name + "' script does not exist");
        }
        return DomsaScriptInterpreter.exec(script, req);
    }
}
