/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codder.bd.daoImp;

import com.codder.bd.conn.CustomDBConnection;
import com.codder.bd.dao.RoleDao;
import com.codder.bd.pojo.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author User
 */
public class RoleDaoImp implements RoleDao {
    Connection conn = CustomDBConnection.getConnect();

    @Override
    public void createTable() {
        //make quarry
        String sql = "create table if not exists student(id int(5) primary key, roleName varchar(20))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("student table created successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insert(Role role) {
        // make quary
        String sql = "insert into test values(?,?)";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, role.getId());
            pstm.setString(2, role.getRoleName());
            pstm.executeUpdate();
            System.out.println("Data inserted into test table successfully");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getRoleById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getRoleByRoleName(String roleName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> getRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
