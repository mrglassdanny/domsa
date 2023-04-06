package com.github.mrglassdanny.domsa.lang.fn.sql;

import com.github.mrglassdanny.domsa.client.SqlClient;
import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.*;

import java.util.List;

public class QueryFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "sql::query";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 1);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "query", args.get(0), FnArgType.String);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var query = args.get(0).getAsString();

        var res = new JsonArray();

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

        return res;
    }
}
