package com.github.mrglassdanny.domsa.lang.fn.ds;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class DsModule extends Module {
    @Override
    public String getName() {
        return "ds";
    }

    @Override
    public void init() {
        this.fns.put("exec", new ExecFn());
    }
}
