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

        properties.put("databaseUrl", props.getProperty("databaseUrl"));

        reader.close();
    }
}
