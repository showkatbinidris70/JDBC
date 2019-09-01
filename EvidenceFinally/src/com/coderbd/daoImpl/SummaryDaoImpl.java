/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.DBConnection;
import com.coderbd.dao.SummaryDao;

import static com.coderbd.daoImpl.ProductDaoImpl.conn;

import com.coderbd.pojo.Summary;

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
public class SummaryDaoImpl implements SummaryDao {

    static Connection conn = DBConnection.getDBConnection();

    public static void main(String[] args) {
        ProductDaoImpl pdao = new ProductDaoImpl();
        pdao.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not exists summary(id int(11) auto_increment primary key, product_name varchar(50), quantity int(11), unit_price double, total_price double)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("summary table created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Summary p) {
        String sql = "insert into summary(product_name,quantity,unit_price,total_price) values (?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setInt(2, p.getQuantity());
            pstm.setDouble(3, p.getSoldQty());
            pstm.setDouble(4, p.getAvailabe());
            pstm.executeUpdate();
            System.out.println("Inserted ");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Summary p) {
        String sql = "update summary set product_name =?, quantity= ?,unit_price =? , total_price = ? where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getProductName());
            pstm.setInt(2, p.getQuantity());
            pstm.setDouble(3, p.getSoldQty());
            pstm.setDouble(4, p.getAvailabe());
            pstm.executeUpdate();
            System.out.println("updated ");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Summary getProductByName(String name) {
        Summary summary = null;
        String sql = "select * from product where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                summary = new Summary(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6), rs.getDouble(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }

    @Override
    public List<Summary> getList() {
        List<Summary> list = new ArrayList();
        String sql = "select * from product";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary summary = new Summary(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6), rs.getDouble(7));
                list.add(summary);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
