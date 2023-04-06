package com.github.mrglassdanny.domsa.lang.fn.env;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class EnvModule extends Module {
    @Override
    public String getName() {
        return "env";
    }

    @Override
    public void init() {
        this.fns.put("get", new GetFn());
        this.fns.put("list", new ListFn());
    }
}
