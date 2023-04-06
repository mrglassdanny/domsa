package com.github.mrglassdanny.domsa.lang.fn.sql;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class SqlModule extends Module {
    @Override
    public String getName() {
        return "sql";
    }

    @Override
    public void init() {
        this.fns.put("query", new QueryFn());
        this.fns.put("exec", new ExecFn());
        this.fns.put("where", new WhereFn());
    }
}
