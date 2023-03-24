package com.github.mrglassdanny.domsa.api;
import java.io.IOException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class ApiClient {

    public static JsonElement get(String urlStr) throws IOException, Exception {

        URL url = new URL(urlStr);

        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(600, TimeUnit.SECONDS).writeTimeout(600, TimeUnit.SECONDS).build();

        Request request = new Request.Builder().url(url).get().addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json").build();

        try (Response response = client.newCall(request).execute()) {
            return new JsonParser().parseString(response.body().string());
        }
    }

    public static JsonElement post(String urlStr, String reqStr) throws IOException, Exception {

        URL url = new URL(urlStr);

        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(600, TimeUnit.SECONDS).writeTimeout(600, TimeUnit.SECONDS).build();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, reqStr);

        Request request = new Request.Builder().url(url).post(body).addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json").build();

        try (Response response = client.newCall(request).execute()) {
            return new JsonParser().parse(response.body().string());
        }
    }
}
