package com.github.mrglassdanny.domsa.lang.fn;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;

import java.util.ArrayList;

public class FnRouter {

    private static void validateArgumentCount(String fnName, int argCnt, int reqArgCnt) throws Exception {
        if (argCnt != reqArgCnt)
            throw new RuntimeException("'" + fnName + "' function expects " + reqArgCnt + " argument(s)");
    }

    public static JsonElement exec(String fnName, ArrayList<JsonElement> fnArgs) throws Exception {

        int fnArgCnt = fnArgs.size();

        switch (fnName) {
            case "env" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);

                var fnRes = EnvRepo.env(fnArgs.get(0).getAsString());
                if (fnRes != null) {
                    return new JsonPrimitive(fnRes);
                } else {
                    return JsonNull.INSTANCE;
                }
            }
            case "sleep" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                UtilRepo.sleep(fnArgs.get(0).getAsLong());
                return JsonNull.INSTANCE;
            }
            case "len" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                return new JsonPrimitive(UtilRepo.len(fnArgs.get(0)));
            }
            case "strcat" -> {
                validateArgumentCount(fnName, fnArgCnt, 2);
                String a = fnArgs.get(0).getAsString();
                String b = fnArgs.get(1).getAsString();
                return new JsonPrimitive(UtilRepo.strcat(a, b));
            }
            case "arrcat" -> {
                validateArgumentCount(fnName, fnArgCnt, 2);
                JsonArray a = fnArgs.get(0).getAsJsonArray();
                JsonArray b = fnArgs.get(1).getAsJsonArray();
                return UtilRepo.arrcat(a, b);
            }
            case "first" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                return UtilRepo.first(fnArgs.get(0).getAsJsonArray());
            }
            case "get" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                return ApiRepo.get(fnArgs.get(0).getAsJsonObject());
            }
            case "post" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                return ApiRepo.post(fnArgs.get(0).getAsJsonObject());
            }
            case "date" -> {
                return switch (fnArgs.size()) {
                    case 0 -> new JsonPrimitive(DateRepo.date());
                    case 1 -> new JsonPrimitive(DateRepo.date(fnArgs.get(0).getAsString()));
                    default -> throw new RuntimeException("'date' function expects less than 2 arguments");
                };
            }
            case "formatDate" -> {
                return switch (fnArgs.size()) {
                    case 1 -> new JsonPrimitive(DateRepo.formatDate(fnArgs.get(0).getAsString()));
                    case 2 -> new JsonPrimitive(DateRepo.formatDate(fnArgs.get(0).getAsString(), fnArgs.get(1).getAsString()));
                    default -> throw new RuntimeException("'formatDate' function expects less than 3 arguments");
                };
            }
            case "buildWhere" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                return new JsonPrimitive(SqlRepo.buildWhere(fnArgs.get(0).getAsJsonObject()));
            }
            default -> throw new RuntimeException("'" + fnName + "' is not a recognized function");
        }
    }

}
