package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.client.SqlClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlRepo {

    private static final Pattern SQL_SELECT_PATTERN = Pattern.compile("select", Pattern.CASE_INSENSITIVE);

    public static JsonArray exec(String query) throws Exception {

        var res = new JsonArray();
        {
            Matcher selectMatcher = SQL_SELECT_PATTERN.matcher(query);

            if (selectMatcher.find()) {

                var rows = SqlClient.execQuery(query);
                var cols = rows.getMetaData();

                while (rows.next()) {
                    var obj = new JsonObject();
                    for (int colIdx = 1; colIdx <= cols.getColumnCount(); colIdx++) {
                        var col = cols.getColumnName(colIdx);

                        if (rows.getObject(colIdx) == null) {
                            obj.add(col, JsonNull.INSTANCE);
                        } else {
                            switch (cols.getColumnType(colIdx)) {
                                case 0 -> // Null
                                        obj.add(col, JsonNull.INSTANCE);
                                case 16 -> // Boolean
                                        obj.add(col, new JsonPrimitive(rows.getBoolean(colIdx)));
                                case -5, 5, 2, -8, -6, 4, -7 -> // Int
                                        obj.add(col, new JsonPrimitive(rows.getInt(colIdx)));
                                case 3, 6, 8 -> // Double
                                        obj.add(col, new JsonPrimitive(rows.getDouble(colIdx)));
                                case 7 -> // Real
                                        obj.add(col, new JsonPrimitive(rows.getBigDecimal(colIdx)));
                                default -> obj.add(col, new JsonPrimitive(rows.getObject(colIdx).toString()));
                            }
                        }
                    }
                    res.add(obj);
                }
                rows.close();

            } else {
                SqlClient.exec(query);
            }
        }
        return res;
    }

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
