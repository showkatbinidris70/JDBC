/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.Connect;
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

    static Connection conn = Connect.getDBConnection();

    public static void main(String[] args) {
        SalesDao sdao = new SalesDaoImpl();
        sdao.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not exists tableSales (id int(11) auto_increment primary key,product_name varchar(50), product_code varchar(50),quantity int(11),unit_price double, total_price double)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("create tableSales");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
//        String sql = "create table if not exists tableSales(id int (11) auto_increment primary key, product_name varchar(50), Product_code varchar(50),quantity int(11), unit_price double, total_price double)";
//        try {
//            PreparedStatement pstm = conn.prepareStatement(sql);
//            pstm.execute();
//            System.out.println("Created tableSales");
//        } catch (SQLException ex) {
//            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @Override
    public void save(Sales s) {
        String sql = "insert into tableSales(product_name,product_code,quantity,unit_price,total_price) values (?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, s.getProductName());
            pstm.setString(2, s.getProductCode());
            pstm.setInt(3, s.getQuantity());
            pstm.setDouble(4, s.getUnitPrice());
            pstm.setDouble(5, s.getTotalPrice());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Sales s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getSalesById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getSalesByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sales> getList() {
        List<Sales> list = new ArrayList();
        String sql = "select * from tableSales";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Sales sales = new Sales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6));
                list.add(sales);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
