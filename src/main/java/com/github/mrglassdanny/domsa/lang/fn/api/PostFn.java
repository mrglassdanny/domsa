package com.github.mrglassdanny.domsa.lang.fn.api;

import com.github.mrglassdanny.domsa.client.ApiClient;
import com.github.mrglassdanny.domsa.lang.fn.DomsaFn;
import com.google.gson.JsonObject;

public class PostFn implements DomsaFn {
    @Override
    public JsonObject exec(JsonObject req) throws Exception {
        var res = new JsonObject();

        String url = req.get("url").getAsString();
        var body = req.get("body");

        var data = ApiClient.post(url, body.toString());

        res.add("data", data);

        return res;
    }
}
