package com.github.mrglassdanny.domsa.lang.fn;

import com.github.mrglassdanny.domsa.client.KafkaClient;
import com.google.gson.JsonObject;

public class KafkaRepo {

    public static void produce(JsonObject req) throws Exception {
        KafkaClient.produce(req.get("topic").getAsString(),
                req.get("key").getAsString(),
                req.get("value").getAsJsonObject());
    }
}
