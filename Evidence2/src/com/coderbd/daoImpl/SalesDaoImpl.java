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

    Connection conn = DBConnection.getDBConnection();

    public static void main(String[] args) {
        SalesDaoImpl sdao = new SalesDaoImpl();
        sdao.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table IF NOT EXISTS sales(id int(11) auto_increment primary key, product_name varchar(50), available_qty int(11), sales_qty int(11), unit_price double, total_price double, p_id int(11),FOREIGN KEY (p_id) REFERENCES product(id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("sales table created");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Sales s) {
        String sql = "insert into sales(product_name, available_qty, sales_qty, unit_price,total_price) values (?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, s.getProductName());
            pstm.setInt(2, s.getAvailableQty());
            pstm.setInt(3, s.getSalseQty());
            pstm.setDouble(4, s.getUnitPrice());
            pstm.setDouble(5, s.getTotalPrice());
            pstm.executeUpdate();
            System.out.println("insert into salses table");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Sales s) {
        String sql = "update sales set(available_qty = ?, sales_qty = ?, unit_price =? ,total_price = ?, where product_name = ?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, s.getAvailableQty());
            pstm.setInt(2, s.getSalseQty());
            pstm.setDouble(3, s.getUnitPrice());
            pstm.setDouble(4, s.getTotalPrice());
            pstm.setString(5, s.getProductName());
            pstm.executeUpdate();
            System.out.println("insert into salses table");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getProductByProductName(String name) {
        Sales sales = null;
        String sql = "select * from sales where product_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sales = new Sales(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sales;
    }

    @Override
    public List<Sales> getList() {

        List<Sales> list = new ArrayList();
        String sql = "select * from sales";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Sales sales = new Sales(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6));
                list.add(sales);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
