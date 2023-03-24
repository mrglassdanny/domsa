package com.github.mrglassdanny.domsa;


import com.github.mrglassdanny.domsa.api.RestClient;
import com.github.mrglassdanny.domsa.db.SqliteConnection;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) throws Exception {

        SqliteConnection.init("C:\\Users\\danie\\OneDrive\\Desktop\\domsa.db");

        Javalin app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("domsa v0.0.1"))
                .start(7070);

        SqliteConnection.close();
    }
}
