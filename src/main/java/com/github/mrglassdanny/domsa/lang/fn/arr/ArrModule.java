package com.github.mrglassdanny.domsa.lang.fn.arr;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class ArrModule extends Module {
    @Override
    public String getName() {
        return "arr";
    }

    @Override
    public void init() {
        this.fns.put("len", new LenFn());
        this.fns.put("concat", new ConcatFn());
        this.fns.put("first", new FirstFn());
    }
}
