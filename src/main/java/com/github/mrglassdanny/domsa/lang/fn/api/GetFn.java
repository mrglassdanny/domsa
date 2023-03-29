package com.github.mrglassdanny.domsa.lang.fn.api;

import com.github.mrglassdanny.domsa.client.ApiClient;
import com.github.mrglassdanny.domsa.lang.fn.DomsaFn;
import com.google.gson.JsonObject;

public class GetFn implements DomsaFn {
    @Override
    public JsonObject exec(JsonObject req) throws Exception {
        var res = new JsonObject();

        String url = req.get("url").getAsString();

        var data = ApiClient.get(url);

        res.add("data", data);

        return res;
    }
}
