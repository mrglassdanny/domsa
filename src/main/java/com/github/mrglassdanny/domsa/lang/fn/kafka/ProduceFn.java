package com.github.mrglassdanny.domsa.lang.fn.kafka;

import com.github.mrglassdanny.domsa.client.KafkaClient;
import com.github.mrglassdanny.domsa.lang.fn.Fn;
import com.github.mrglassdanny.domsa.lang.fn.FnArgType;
import com.github.mrglassdanny.domsa.lang.fn.FnUtil;
import com.google.gson.JsonElement;

import java.util.List;

public class ProduceFn implements Fn {
    @Override
    public String getFullyQualifiedName() {
        return "kafka::produce";
    }

    @Override
    public void validateArgs(List<JsonElement> args) throws Exception {
        FnUtil.validateArgumentCount(this.getFullyQualifiedName(), args.size(), 3);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "topic", args.get(0), FnArgType.String);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "key", args.get(1), FnArgType.String);
        FnUtil.validateArgumentType(this.getFullyQualifiedName(), "value", args.get(2), FnArgType.JsonObject);
    }

    @Override
    public JsonElement exec(List<JsonElement> args) throws Exception {
        var topic = args.get(0).getAsString();
        var key = args.get(1).getAsString();
        var value = args.get(2).getAsJsonObject();

        KafkaClient.produce(topic, key, value);

        return null;
    }
}
