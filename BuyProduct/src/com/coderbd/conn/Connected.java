/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class Connected {

    static Connection conn = null;

    public static void main(String[] args) {
        Connected.getDBconnection();
    }

    public static Connection getDBconnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/showkat", "root", "1234");
            System.out.println("Data Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Connected.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
