package com.github.mrglassdanny.domsa.lang.fn;

import java.util.HashMap;

public abstract class Module {

    public HashMap<String, Fn> fns;

    public Module() {
        this.fns = new HashMap<>();
        this.init();
    }

    public abstract String getName();
    public abstract void init();

}
