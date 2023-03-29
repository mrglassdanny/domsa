package com.github.mrglassdanny.domsa.lang.fn;

import com.google.gson.JsonObject;

public interface DomsaFn {
    JsonObject exec(JsonObject req) throws Exception;
}
