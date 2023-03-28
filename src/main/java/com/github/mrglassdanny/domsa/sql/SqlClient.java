package com.github.mrglassdanny.domsa.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlClient {

    private static Connection conn;

    public static void init(String url) throws SQLException {
        conn = DriverManager.getConnection(url);
    }

    public static void close() throws SQLException {
        conn.close();
    }

    public static int exec(String query) throws SQLException {
        Statement stmt = conn.createStatement();
        return stmt.executeUpdate(query);
    }

    public static ResultSet execQuery(String query) throws SQLException {
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(query);
    }
}
