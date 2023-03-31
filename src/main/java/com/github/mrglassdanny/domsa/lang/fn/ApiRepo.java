package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.client.ApiClient;
import com.google.gson.JsonObject;

public class ApiRepo {
    public static JsonObject get(JsonObject req) throws Exception {
        return ApiClient.get(req);
    }

    public static JsonObject post(JsonObject req) throws Exception {
        return ApiClient.post(req);
    }
}
