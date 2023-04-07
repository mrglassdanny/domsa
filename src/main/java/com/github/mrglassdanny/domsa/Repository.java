package com.github.mrglassdanny.domsa;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Repository {
    public static HashMap<String, String> scripts = new HashMap<>();
    public static HashMap<String, String> apis = new HashMap<>();
    public static HashMap<String, String> events = new HashMap<>();

    public static void init() throws Exception {
        File dir = new File("script");
        addScripts(dir.listFiles(), scripts, true);

        dir = new File("api");
        addScripts(dir.listFiles(), apis, false);

        dir = new File("event");
        addScripts(dir.listFiles(), events, true);
    }

    private static void addScripts(File[] files, HashMap<String, String> repo, boolean excludeStartDir) throws Exception {
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                addScripts(file.listFiles(), repo, excludeStartDir);
            } else {

                String script = new String(Files.readAllBytes(Paths.get(file.getPath())));

                String path = file.getPath().replace('\\', '/');
                path = path.substring(0, path.lastIndexOf('.'));

                if (excludeStartDir) {
                    path = path.substring(path.indexOf('/') + 1);
                }

                repo.put(path, script);
            }
        }
    }
}
