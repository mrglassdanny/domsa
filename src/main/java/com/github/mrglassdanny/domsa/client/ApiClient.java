package com.github.mrglassdanny.domsa.client;
import java.io.IOException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class ApiClient {

    private static OkHttpClient httpClient = new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(600, TimeUnit.SECONDS).writeTimeout(600, TimeUnit.SECONDS).build();


    public static JsonObject get(JsonObject req) throws Exception {

        // Expecting url, headers?

        var reqUrlStr = req.get("url").getAsString();
        URL reqUrl = new URL(reqUrlStr);

        var request = new Request.Builder().url(reqUrl).get();

        // Default headers
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");

        // Custom headers
        if (req.get("headers") != null && !req.get("headers").isJsonNull()) {
            var reqHeaders = req.get("headers").getAsJsonObject();
            for (var entry : reqHeaders.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue().getAsString());
            }
        }

        try (Response response = httpClient.newCall(request.build()).execute()) {

            var resHeaders = new JsonObject();
            for (var headerName : response.headers().names()) {
                resHeaders.addProperty(headerName, response.headers().get(headerName));
            }
            var resBody = JsonParser.parseString(response.body().string());

            var res = new JsonObject();
            res.add("headers", resHeaders);
            res.add("body", resBody);
            return res;
        }
    }
    public static JsonObject post(JsonObject req) throws Exception {

        // Expecting url, headers?, body

        var reqUrlStr = req.get("url").getAsString();
        URL reqUrl = new URL(reqUrlStr);

        var reqBodyStr = req.get("body").getAsString();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody reqBody = RequestBody.create(mediaType, reqBodyStr);

        var request = new Request.Builder().url(reqUrl).post(reqBody);

        // Default headers
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");

        // Custom headers
        if (req.get("headers") != null && !req.get("headers").isJsonNull()) {
            var reqHeaders = req.get("headers").getAsJsonObject();
            for (var entry : reqHeaders.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue().getAsString());
            }
        }

        try (Response response = httpClient.newCall(request.build()).execute()) {

            var resHeaders = new JsonObject();
            for (var headerName : response.headers().names()) {
                resHeaders.addProperty(headerName, response.headers().get(headerName));
            }
            var resBody = JsonParser.parseString(response.body().string());

            var res = new JsonObject();
            res.add("headers", resHeaders);
            res.add("body", resBody);
            return res;
        }
    }
}
