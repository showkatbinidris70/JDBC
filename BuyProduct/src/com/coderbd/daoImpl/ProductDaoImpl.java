/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.Connected;
import com.coderbd.dao.ProductDao;
import com.coderbd.pojo.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class ProductDaoImpl implements ProductDao {

    static Connection conn = Connected.getDBconnection();

    public static void main(String[] args) {
        ProductDao productDao = new ProductDaoImpl();
        productDao.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not exists tableProduct(id int(11) auto_increment primary key, product_name varchar(50),product_code varchar(50),quantity int(11),unit_price double, total_price double)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("tableProduct created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Product p) {
        String sql = "insert into tableProduct(product_name,product_code,quantity,unit_price,total_price) values (?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setString(2, p.getProductCode());
            pstm.setInt(3, p.getQuantity());
            pstm.setDouble(4, p.getUnitPrice());
            pstm.setDouble(5, p.getTotalPrice());
            pstm.executeUpdate();
            System.out.println("insert into tableProduct");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    @Override
//    public void update(Product p) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void delete(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Product getProductById(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public Product getProductCodeByCode(String code) {
//        Product product = null;
//        String sql = "select * from tableProduct where product_code = ?";
//        try {
//            PreparedStatement pstm = conn.prepareStatement(sql);
//            pstm.setString(1, code);
//            ResultSet rs = pstm.executeQuery();
//            while (rs.next()) {
//                product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }

    @Override
    public List<Product> getList() {
        List<Product> list = new ArrayList();
        String sql = "select * from tableProduct";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6));
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
