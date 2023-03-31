package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.client.ApiClient;
import com.google.gson.JsonObject;

public class ApiRepo {
    public static JsonObject get(JsonObject req) throws Exception {
        var res = new JsonObject();
        String reqUrl = req.get("url").getAsString();
        var resBody = ApiClient.get(reqUrl);
        res.add("body", resBody);
        return res;
    }

    public static JsonObject post(JsonObject req) throws Exception {
        var res = new JsonObject();
        String reqUrl = req.get("url").getAsString();
        var reqBody = req.get("body");
        var resBody = ApiClient.post(reqUrl, reqBody.toString());
        res.add("body", resBody);
        return res;
    }
}
