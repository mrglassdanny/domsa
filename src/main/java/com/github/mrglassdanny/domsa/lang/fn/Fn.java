package com.github.mrglassdanny.domsa.lang.fn;

import com.google.gson.JsonElement;

import java.util.List;

public interface Fn {

    String getFullyQualifiedName();

    void validateArgs(List<JsonElement> args) throws Exception;

    JsonElement exec(List<JsonElement> args) throws Exception;
}
