/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.ConnectDB;
import com.coderbd.dao.ProductDao;
import com.coderbd.pojo.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class ProductDaoImpl implements ProductDao {

    static Connection conn = ConnectDB.getDBConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists productPurches (id int(11) auto_increment primary key, product_name varchar(50), product_code varchar(50), quantity (11), unit_price double,total_price double)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("productPurches created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Product p) {
        String sql = "insert into productPurches(product_name,product_code,quantity,unit_price,total_price) values (?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setString(2, p.getProductCode());
            pstm.setInt(3, p.getQuantity());
            pstm.setDouble(4, p.getUnitPirce());
            pstm.setDouble(5, p.getTotalPrice());
            pstm.executeUpdate();
            System.out.println("inserted into productPurches");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Product getProductByCode(String code) {
        Product product = null;
        String sql = "select * from productPurches where product_code  code = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, code);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                product = new Product(rs.getString(1), rs.getString(2), rs.getInt(Integer.parseInt(3)), Double.parseDouble(rs.getDouble(4)), Double.parseDouble(rs.getDouble(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Product> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
