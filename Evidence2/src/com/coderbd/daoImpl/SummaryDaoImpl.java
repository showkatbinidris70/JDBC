/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.DBConnection;
import com.coderbd.dao.SummaryDao;
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

    Connection conn = DBConnection.getDBConnection();

    public static void main(String[] args) {
        SummaryDaoImpl sdi = new SummaryDaoImpl();
        sdi.createTable();
    }

    @Override
    public void createTable() {

        String sql = "create table if not exists summary (product_name varchar(50), total_qty double, sold_qty double, availabe_qty double, p_id int(11), FOREIGN KEY (p_id) REFERENCES product(id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Summary table created");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void save(Summary sm) {

        String sql = "insert into summary(product_name, total_qty, sold_qty, availabe_qty) values (?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, sm.getProductName());
            pstm.setDouble(2, sm.getTotalQty());
            pstm.setDouble(3, sm.getSoldQty());
            pstm.setDouble(4, sm.getAvailableQty());
            pstm.executeUpdate();
            System.out.println("Insert success ");
        } catch (Exception ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Summary sm) {
        //  String sql = "update summary set (total_qty=?,sold_qty=?,available_qty=?,where product_code=?)";
        String sql = "update summary set (total_qty = ?, sold_qty = ?, availabe_qty = ?, where product_name = ?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setDouble(1, sm.getTotalQty());
            pstm.setDouble(2, sm.getSoldQty());
            pstm.setDouble(3, sm.getAvailableQty());
            pstm.setString(4, sm.getProductName());
            pstm.executeUpdate();
            System.out.println("update success ");
        } catch (Exception ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Summary getProductByProductName(String name) {

        Summary summary = null;
        String sql = "select * from summary where product_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                summary = new Summary(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }

    @Override
    public List<Summary> getList() {
        List<Summary> list = new ArrayList();
        String sql = "select * from summary";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary summary = new Summary(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5));
                list.add(summary);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
