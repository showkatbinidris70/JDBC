/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codder.bd.test;

import com.codder.bd.conn.CustomDBConnection;


/**
 * @author User
 */
public class TestConnection {

    public static void main(String[] args) {
        CustomDBConnection.getConnect();
    }
}
