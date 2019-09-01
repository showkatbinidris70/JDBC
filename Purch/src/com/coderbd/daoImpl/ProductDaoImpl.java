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
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class ProductDaoImpl implements ProductDao {

    static Connection conn = Connected.getDBConnection();

    public static void main(String[] args) {
        ProductDao pdao = new ProductDaoImpl();
        pdao.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not exists khata(id int(11) tuto_increment primary key,product_name varchar(50),product_name varchar(50),quantity int(11), unit_price double, total_price double)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("ok");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Product p) {
        String sql = "insert into khata(product_name,product_code,quantity,unit_price,total_price) values (?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setString(2, p.getProductCode());
            pstm.setInt(3, p.getQty());
            pstm.setDouble(4, p.getUnitPrice());
            pstm.setDouble(5, p.getTotalPrice());
            pstm.executeUpdate();
            System.out.println("ok ok");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Product> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
