package com.github.mrglassdanny.domsa;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Properties;

public class Environment {

    public static HashMap<String, String> properties = new HashMap<>();

    public static void init() throws Exception {
        String envFilePath = "environment.properties";
        FileReader reader = new FileReader((envFilePath));

        Properties props = new Properties();
        props.load(reader);

        for (var entry : props.entrySet()) {
            var key = entry.getKey().toString();
            var val = entry.getValue().toString();
            properties.put(key, val);
        }

        reader.close();
    }
}
