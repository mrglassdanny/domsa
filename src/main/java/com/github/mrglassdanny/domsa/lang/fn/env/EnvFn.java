package com.github.mrglassdanny.domsa.lang.fn.env;

import com.github.mrglassdanny.domsa.Environment;
import com.github.mrglassdanny.domsa.client.ApiClient;
import com.github.mrglassdanny.domsa.lang.fn.DomsaFn;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class EnvFn implements DomsaFn {
    @Override
    public JsonObject exec(JsonObject req) throws Exception {
        var res = new JsonObject();

        String prop = req.get("property").getAsString();

        var data = Environment.properties.get(prop);

        res.add("data", data != null ? new JsonPrimitive(data) : JsonNull.INSTANCE);

        return res;
    }
}
