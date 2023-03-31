package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.Environment;

public class EnvRepo {
    public static String env(String property) throws Exception {
        var val = Environment.properties.get(property);
        return val;
    }
}
