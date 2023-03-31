package com.github.mrglassdanny.domsa.lang;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class DomsaScriptRegistry {
    public static HashMap<String, String> scripts = new HashMap<>();

    public static void init() throws Exception {
        File dir = new File("ds/");
        addScripts(dir.listFiles());
    }

    private static void addScripts(File[] files) throws Exception {
        for (File file : files) {
            if (file.isDirectory()) {
                addScripts(file.listFiles());
            } else {

                String script = new String(Files.readAllBytes(Paths.get(file.getPath())));

                String path = file.getPath().replace('\\', '/');
                path = path.substring(0, path.lastIndexOf('.'));

                scripts.put(path, script);
            }
        }
    }
}
