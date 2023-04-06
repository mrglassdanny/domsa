package com.github.mrglassdanny.domsa.lang.fn.api;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class ApiModule extends Module {

    @Override
    public String getName() {
        return "api";
    }

    @Override
    public void init() {
        this.fns.put("get", new GetFn());
        this.fns.put("post", new PostFn());
    }
}
