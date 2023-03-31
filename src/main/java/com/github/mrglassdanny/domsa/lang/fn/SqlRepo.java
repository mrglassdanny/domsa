package com.github.mrglassdanny.domsa.lang.fn;

import com.google.gson.JsonObject;

public class SqlRepo {

    public static String buildWhere(JsonObject obj) {
        StringBuilder buf = new StringBuilder(1024);
        buf.append(" 1 = 1");

        for (var entry : obj.entrySet()) {

            var key = entry.getKey();
            var val = entry.getValue();

            if (val.isJsonObject()) {
                throw new RuntimeException("'buildWhere' function does not support nested JsonObjects");
            } else {
                if (val.isJsonArray()) {
                    buf.append(" and ").append(key).append(" in (");
                    for (var a : val.getAsJsonArray()) {
                        if (!a.isJsonPrimitive()) {
                            throw new RuntimeException("'buildWhere' function requires arrays to store primitive values");
                        }

                        var prim = a.getAsJsonPrimitive();

                        if (prim.isBoolean()) {
                            buf.append(prim).append(",");
                        } else if (prim.isNumber()) {
                            buf.append(prim).append(",");
                        } else {
                            buf.append("'").append(prim).append("',");
                        }
                    }
                    buf.deleteCharAt(buf.length() - 1);
                    buf.append(")");
                } else if (val.isJsonPrimitive()) {
                    var prim = val.getAsJsonPrimitive();
                    if (prim.isBoolean()) {
                        buf.append(" and ").append(key).append(" = ").append(val);
                    } else if (prim.isNumber()) {
                        buf.append(" and ").append(key).append(" = ").append(val);
                    } else {
                        buf.append(" and ").append(key).append(" = '").append(val).append("'");
                    }
                } else {
                    buf.append(" and ").append(key).append(" = null");
                }
            }
        }

        return buf.toString().replace("\"", "");
    }
}
