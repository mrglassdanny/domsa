package com.github.mrglassdanny.domsa;


import com.github.mrglassdanny.domsa.api.ApiClient;
import com.github.mrglassdanny.domsa.sql.SqlClient;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) throws Exception {

        SqlClient.init("C:\\Users\\danie\\OneDrive\\Desktop\\domsa.db");

        var res = ApiClient.get("https://api.sportsdata.io/v3/cbb/scores/json/TeamSeasonStats/2023?key=125650329e0d47aa9f2caee8a2a6ce7a");

        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("domsa v0.0.1"))
                .start(7070);

        SqlClient.close();
    }
}
