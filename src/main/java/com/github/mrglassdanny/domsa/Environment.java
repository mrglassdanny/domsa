package com.github.mrglassdanny.domsa;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Properties;

public class Environment {

    private static HashMap<String, String> properties = new HashMap<>();
    private static HashMap<String, String> defaultProperties = new HashMap<>();

    public static void init() throws Exception {

        // Default properties
        {
            defaultProperties.put("name", "domsa-app");
            defaultProperties.put("port", "7070");

            defaultProperties.put("defaultDateFormat", "yyyy-MM-dd");
            defaultProperties.put("defaultDateTimeFormat", "yyyy-MM-dd'T'HH:mm:ss");
        }


        String envFilePath = "environment.properties";
        FileReader reader = new FileReader(envFilePath);

        Properties props = new Properties();
        props.load(reader);

        for (var entry : props.entrySet()) {
            var key = entry.getKey().toString();
            var val = entry.getValue().toString();
            properties.put(key, val);
        }

        reader.close();
    }

    public static String get(String key) {
        if (!properties.containsKey(key)) {
            return defaultProperties.getOrDefault(key, null);
        } else {
            return properties.get(key);
        }
    }

    public static HashMap<String, String> properties() {
        return properties;
    }
}
