package com.github.mrglassdanny.domsa.lang.fn.str;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class StrModule extends Module {
    @Override
    public String getName() {
        return "str";
    }

    @Override
    public void init() {
        this.fns.put("len", new LenFn());
        this.fns.put("concat", new ConcatFn());
    }
}
