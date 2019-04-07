/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.DBConnection;
import com.coderbd.dao.ProductDao;
import com.coderbd.pojo.Product;
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
public class ProductDaoImpl implements ProductDao {

    Connection conn = DBConnection.getBDConnection();
   
    
    @Override
    public void createTable() {
        String sql = "create table if not exists productTable (id int(11) auto_increment primary key,quantity int(11), unit_price double,total_price double)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     
    }

    @Override
    public void save(Product p) {
       String sql = "inset into productTable(product_name,quantity,unit_price,total_price) values (?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setInt(2, p.getId());
            pstm.setDouble(3, p.getUnitPrice());
            pstm.setDouble(4, p.getTotalPrice());
            pstm.executeUpdate();
            System.out.println("inset into table");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
    
    }

    @Override
    public void update(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductById(int id) {
       Product product  = null;
       String sql = "select * from productTable where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public List<Product> getList() {
        
    }

    @Override
    public Product getProductById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
