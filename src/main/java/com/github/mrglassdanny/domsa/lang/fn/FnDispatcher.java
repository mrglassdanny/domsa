package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.client.SqlClient;
import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.lang.DomsaScriptRepository;
import com.google.gson.*;

import java.util.ArrayList;

public class FnDispatcher {

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
            case "produce" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                KafkaRepo.produce(fnArgs.get(0).getAsJsonObject());
                return new JsonObject();
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
            case "sql" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                return SqlRepo.exec(fnArgs.get(0).getAsString());
            }
            case "buildWhere" -> {
                validateArgumentCount(fnName, fnArgCnt, 1);
                return new JsonPrimitive(SqlRepo.buildWhere(fnArgs.get(0).getAsJsonObject()));
            }
            case "ds" -> {
                validateArgumentCount(fnName, fnArgCnt, 2);
                return DsRepo.exec(fnArgs.get(0).getAsString(), fnArgs.get(1).getAsJsonObject());
            }
            default -> throw new RuntimeException("'" + fnName + "' is not a recognized function");
        }
    }

}
