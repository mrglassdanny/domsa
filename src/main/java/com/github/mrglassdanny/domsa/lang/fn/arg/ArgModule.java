package com.github.mrglassdanny.domsa.lang.fn.arg;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class ArgModule extends Module {
    @Override
    public String getName() {
        return "arg";
    }

    @Override
    public void init() {
        this.fns.put("expect", new ExpectFn());
    }
}
