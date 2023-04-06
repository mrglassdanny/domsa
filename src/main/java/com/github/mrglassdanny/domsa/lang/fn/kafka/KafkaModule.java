package com.github.mrglassdanny.domsa.lang.fn.kafka;

import com.github.mrglassdanny.domsa.lang.fn.Module;

public class KafkaModule extends Module {
    @Override
    public String getName() {
        return "kafka";
    }

    @Override
    public void init() {
        this.fns.put("produce", new ProduceFn());
    }
}
