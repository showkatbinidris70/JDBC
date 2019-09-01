package com.coderbd.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomDbConnection {

    public static void main(String[] args) {
        CustomDbConnection.getConnection();
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dhaka", "root", "1234");
            System.out.println("Database Connected");
        } catch (SQLException ex) {
            Logger.getLogger(CustomDbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
