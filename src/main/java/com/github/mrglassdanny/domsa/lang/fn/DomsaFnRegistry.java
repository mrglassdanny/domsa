package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.lang.fn.api.GetFn;
import com.github.mrglassdanny.domsa.lang.fn.api.PostFn;
import com.github.mrglassdanny.domsa.lang.fn.env.EnvFn;
import com.github.mrglassdanny.domsa.lang.fn.sql.SqlFn;
import com.github.mrglassdanny.domsa.lang.fn.util.DateFn;

import java.util.HashMap;

public class DomsaFnRegistry {

    public static HashMap<String, DomsaFn> fns = new HashMap<>();

    public static void init() {
        fns.put("env", new EnvFn());
        fns.put("sql", new SqlFn());
        fns.put("get", new GetFn());
        fns.put("post", new PostFn());
        fns.put("date", new DateFn());
    }
}
