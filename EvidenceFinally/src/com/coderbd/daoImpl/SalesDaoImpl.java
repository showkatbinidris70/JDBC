/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.DBConnection;
import com.coderbd.dao.SalesDao;
import com.coderbd.pojo.Sales;

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
public class SalesDaoImpl implements SalesDao {

    static Connection conn = DBConnection.getDBConnection();

    public static void main(String[] args) {
        SalesDaoImpl sdao = new SalesDaoImpl();
        sdao.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not exists sales(id int(11) auto_increment primary key, product_name varchar(50), quantity int(11), unit_price double, total_price double)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("sales table created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Sales p) {
        String sql = "insert into Sales(product_name,quantity,unit_price,total_price) values (?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setInt(2, p.getQuantity());
            pstm.setDouble(3, p.getUnitPrice());
            pstm.setDouble(4, p.getTotalPrice());
            pstm.executeUpdate();
            System.out.println("Inserted ");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Sales p) {
        String sql = "update Sales set product_name =?, quantity= ?,unit_price =? , total_price = ? where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setInt(2, p.getQuantity());
            pstm.setDouble(3, p.getUnitPrice());
            pstm.setDouble(4, p.getTotalPrice());
            pstm.executeUpdate();
            System.out.println("Inserted ");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Sales getProductByName(String name) {
        Sales sales = null;
        String sql = "select * from product where name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sales = new Sales(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sales;
    }

    @Override
    public List<Sales> getList() {
        List<Sales> list = new ArrayList();
        String sql = "select * from product";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Sales sales = new Sales(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5));
                list.add(sales);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

}
