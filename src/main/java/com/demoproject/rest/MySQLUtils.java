package com.demoproject.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by ss on 2017/11/25.
 */
public class MySQLUtils {

    private static final String URL = "jdbc:mysql://localhost:3306/ticket_solder?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "syt19930224";

    public static String getData(String message) {


        String dbMessage = "";

        try {

            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();

            String sql = "select userName from user";
            ResultSet rs = stmt.executeQuery(sql);

            rs.next();

            dbMessage = rs.getString(1);

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dbMessage;
    }
}
