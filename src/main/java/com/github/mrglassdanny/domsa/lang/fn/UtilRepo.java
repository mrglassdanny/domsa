package com.github.mrglassdanny.domsa.lang.fn;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;

public class UtilRepo {

    public static int len(JsonElement elem) {

        if (elem.isJsonArray()) {
            return elem.getAsJsonArray().size();
        } else if (elem.isJsonPrimitive()) {
            if (elem.getAsJsonPrimitive().isString()) {
                return elem.getAsString().length();
            } else {
                throw new RuntimeException("'len' function expects either string or array as argument");
            }
        } else {
            throw new RuntimeException("'len' function expects either string or array as argument");
        }
    }

    public static String strcat(String a, String b) {
        return a + b;
    }

    public static JsonArray arrcat(JsonArray a, JsonArray b) {
        var arr = new JsonArray(a.size() + b.size());
        arr.addAll(a);
        arr.addAll(b);
        return arr;
    }

    public static JsonElement first(JsonArray arr) {
        if (arr.size() == 0) {
            return JsonNull.INSTANCE;
        }
        return arr.get(0);
    }
}
