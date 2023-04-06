package com.github.mrglassdanny.domsa.lang.fn;

import com.google.gson.JsonElement;

public class FnUtil {
    public static void validateArgumentCount(String name, int argCnt, int reqArgCnt) throws Exception {
        if (argCnt != reqArgCnt)
            throw new RuntimeException(name + " expects " + reqArgCnt + " argument(s)");
    }

    public static void validateArgumentType(String name, String argName, JsonElement arg, FnArgType reqType) throws Exception {

        if (arg == null) {
            throw new RuntimeException(name + " expects argument '" + argName + "' to not be null");
        }

        switch (reqType) {
            case Boolean -> {
                if (!arg.isJsonPrimitive() || !arg.getAsJsonPrimitive().isBoolean()) {
                    throw new RuntimeException(name + " expects argument '" + argName + "' to be boolean");
                }
            }
            case Number -> {
                if (!arg.isJsonPrimitive() || !arg.getAsJsonPrimitive().isNumber()) {
                    throw new RuntimeException(name + " expects argument '" + argName + "' to be number");
                }
            }
            case String -> {
                if (!arg.isJsonPrimitive() || !arg.getAsJsonPrimitive().isString()) {
                    throw new RuntimeException(name + " expects argument '" + argName + "' to be string");
                }
            }
            case JsonArray -> {
                if (!arg.isJsonArray()) {
                    throw new RuntimeException(name + " expects argument '" + argName + "' to be array");
                }
            }
            case JsonObject -> {
                if (!arg.isJsonObject()) {
                    throw new RuntimeException(name + " expects argument '" + argName + "' to be object");
                }
            }
            default -> {
                throw new RuntimeException(name + " expects unsupported argument type");
            }
        }
    }
}
