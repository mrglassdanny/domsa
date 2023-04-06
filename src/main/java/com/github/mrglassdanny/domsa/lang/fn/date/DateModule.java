package com.github.mrglassdanny.domsa.lang.fn.date;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class DateModule extends Module {
    @Override
    public String getName() {
        return "date";
    }

    @Override
    public void init() {
        this.fns.put("today", new TodayFn());
        this.fns.put("now", new NowFn());
    }
}
