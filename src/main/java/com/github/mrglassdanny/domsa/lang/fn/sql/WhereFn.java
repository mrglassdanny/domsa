package com.github.mrglassdanny.domsa.lang.fn.sql;

import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

import java.util.List;

public class WhereFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "sql::where";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 1);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "object", args.get(0), FnArgType.JsonObject);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var obj = args.get(0).getAsJsonObject();

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

        return new JsonPrimitive(buf.toString().replace("\"", ""));
    }
}
