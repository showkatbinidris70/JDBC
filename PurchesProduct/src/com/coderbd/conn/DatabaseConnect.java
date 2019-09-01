/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.conn;

import com.mysql.jdbc.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class DatabaseConnect {

    public static void main(String[] args) {
        DatabaseConnect.getDataConnection();
    }

    public static Connection getDataConnection() {
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/showkat", "root", "1234");
            System.out.println("Connected");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
