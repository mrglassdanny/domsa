package com.github.mrglassdanny.domsa.lang.fn.sql;

import com.github.mrglassdanny.domsa.lang.fn.DomsaFn;
import com.github.mrglassdanny.domsa.client.SqlClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlFn implements DomsaFn {
    private static final Pattern SQL_SELECT_PATTERN = Pattern.compile("select", Pattern.CASE_INSENSITIVE);

    @Override
    public JsonObject exec(JsonObject req) throws Exception {
        var res = new JsonObject();

        String query = req.get("query").getAsString();

        Matcher selectMatcher = SQL_SELECT_PATTERN.matcher(query);

        if (selectMatcher.find()) {

            var data = new JsonArray();

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
                data.add(obj);
            }
            rows.close();

            res.add("rows", new JsonPrimitive(data.size()));
            res.add("data", data);

        } else {
            int rowsAffected = SqlClient.exec(query);
            res.addProperty("rowsAffected", rowsAffected);
        }

        return res;
    }
}
