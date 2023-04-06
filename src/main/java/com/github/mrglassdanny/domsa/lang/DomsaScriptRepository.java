package com.github.mrglassdanny.domsa.lang;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class DomsaScriptRepository {
    public static HashMap<String, String> scripts = new HashMap<>();

    public static void init() throws Exception {
        File dir = new File("../ds/");
        addScripts(dir.listFiles(), scripts);
    }

    private static void addScripts(File[] files, HashMap<String, String> repo) throws Exception {
        for (File file : files) {
            if (file.isDirectory()) {
                addScripts(file.listFiles(), repo);
            } else {

                String script = new String(Files.readAllBytes(Paths.get(file.getPath())));

                String path = file.getPath().replace('\\', '/');
                path = path.substring(0, path.lastIndexOf('.'));

                repo.put(path, script);
            }
        }
    }
}
