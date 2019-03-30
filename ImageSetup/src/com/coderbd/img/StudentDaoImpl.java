/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.img;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StudentDaoImpl implements StudentDao{
    static Connection conn = DbConnection.getConnection();
    public static void main(String[] args) {
        createTable();
    }

    private static void createTable() {
       String sql = "CREATE TABLE 'student' ( 'id' INT NOT NULL auto_increment, "
               + "'name' TEXT NOT NULL , 'photo' BLOB NOT NULL , 'file_path' varchar(150),"
               + "'file_name' varchar(100) NOT NULL, PRIMARY KEY ('id'))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void save(Student student, File file) {
        FileInputStream inputStream = null;
        String sql = "insert into student(name, photo, file_path, file_name) values(?,?,?,?)";
        try {
            inputStream = new FileInputStream(file);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setBinaryStream(2, (InputStream) inputStream,(int)  (file.length()));
           // ps.setString(3, student.get);
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Student> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
