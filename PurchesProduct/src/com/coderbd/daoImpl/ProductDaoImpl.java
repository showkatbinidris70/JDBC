/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.DatabaseConnect;
import com.coderbd.dao.ProductDao;
import com.coderbd.pojo.Product;
import com.mysql.jdbc.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static java.util.Collections.list;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class ProductDaoImpl implements ProductDao {

    Connection conn = DatabaseConnect.getDataConnection();

    public static void main(String[] args) {
        ProductDao pdao = new ProductDaoImpl();
        pdao.createTable();
    }

    @Override
    public void createTable() {
        try {
            String sql = "create table if not exists productTable (id int (11) auto_increment primary key, product_name varchar(50), product_code varchar(50), quantiry int(11), unit_Price double, total_price double)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("ProductTable Created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Product p) {
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
    public void dalete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductByCode(String code) {
        Product product = null;
        try {
            String sql = "select * from productTable where product_code  code = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, code);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                product = new Product(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public List<Product> getList() {
        List<Product> list = new ArrayList();
        try {
            String sql = "select * from productTable";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeQuery();
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(1), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6));
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
