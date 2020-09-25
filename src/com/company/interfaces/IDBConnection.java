package com.company.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public interface IDBConnection {
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:63500/browser/";
    static final String USER = "root";
    static final String PASS = "asdoooasd";

    public static void main(String[] argv) {
        Connection connection = null;

        try {
            connection = getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected");
        } else {
            System.out.println("Failed to make connection");
        }
    }
}

