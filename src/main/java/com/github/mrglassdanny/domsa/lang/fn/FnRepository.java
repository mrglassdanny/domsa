package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.lang.fn.Module;
import com.github.mrglassdanny.domsa.lang.fn.api.ApiModule;
import com.github.mrglassdanny.domsa.lang.fn.arg.ArgModule;
import com.github.mrglassdanny.domsa.lang.fn.arr.ArrModule;
import com.github.mrglassdanny.domsa.lang.fn.date.DateModule;
import com.github.mrglassdanny.domsa.lang.fn.ds.DsModule;
import com.github.mrglassdanny.domsa.lang.fn.env.EnvModule;
import com.github.mrglassdanny.domsa.lang.fn.kafka.KafkaModule;
import com.github.mrglassdanny.domsa.lang.fn.sql.SqlModule;
import com.github.mrglassdanny.domsa.lang.fn.str.StrModule;
import com.google.gson.*;

import java.util.ArrayList;
import java.util.HashMap;

public class FnRepository {

    private static HashMap<String, Module> modules = new HashMap<>();

    private static void validateArgumentCount(String fnName, int argCnt, int reqArgCnt) throws Exception {
        if (argCnt != reqArgCnt)
            throw new RuntimeException("'" + fnName + "' function expects " + reqArgCnt + " argument(s)");
    }

    public static void init() throws Exception {
        var env = new EnvModule();
        var ds = new DsModule();
        var sql = new SqlModule();
        var api = new ApiModule();
        var kafka = new KafkaModule();
        var date = new DateModule();
        var str = new StrModule();
        var arr = new ArrModule();
        var arg = new ArgModule();

        modules.put(env.getName(), env);
        modules.put(ds.getName(), ds);
        modules.put(sql.getName(), sql);
        modules.put(api.getName(), api);
        modules.put(kafka.getName(), kafka);
        modules.put(date.getName(), date);
        modules.put(str.getName(), str);
        modules.put(arr.getName(), arr);
        modules.put(arg.getName(), arg);
    }

    public static JsonElement exec(String moduleName, String fnName, ArrayList<JsonElement> fnArgs) throws Exception {

        var mod = modules.get(moduleName);
        if (mod == null) {
            throw new RuntimeException(moduleName + " does not exist");
        }

        var fn = mod.fns.get(fnName);
        if (fn == null) {
            throw new RuntimeException(moduleName + "::" + fnName + " does not exist");
        }

        fn.validateArgs(fnArgs);

        var res = fn.exec(fnArgs);

        if (res == null) {
            res = JsonNull.INSTANCE;
        }

        return res;
    }

}
