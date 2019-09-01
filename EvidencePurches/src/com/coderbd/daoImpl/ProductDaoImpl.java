/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.DataConnection;
import com.coderbd.dao.ProductDao;
import com.coderbd.pojo.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class ProductDaoImpl implements ProductDao {

    Connection conn = DataConnection.getDBConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists purchProduct (id int(11) auto_increment primary key, product_name varchar(50), product_code varchar(50),quantity int(11), unit_price double, total_price double)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void save(Product p) {
        // String sql = "insert into purchProduct(product_name,product_code,quantity,unit_price,total_price) values (?,?,?,?,?)";
        try {
            String sql = "insert into productTable(product_name,product_code,quantiry,unit_Price,total_price) values (?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setString(2, p.getProductCode());
            pstm.setInt(3, p.getQuantity());
            pstm.setDouble(4, p.getUnitPirce());
            pstm.setDouble(5, p.getTotalPrice());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
