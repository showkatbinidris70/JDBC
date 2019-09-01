/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.Connet;
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

    static Connection conn = Connet.getDBConnection();

    public static void main(String[] args) {
        SalesDaoImpl sdao = new SalesDaoImpl();
        sdao.createTable();
    }

    @Override
    public void createTable() {
        //"create table IF NOT EXISTS sales(id int(11) auto_increment primary key, product_name varchar(50),product_code varchar(30),qty int(11),unit_price double,total_price double, sales_date date, p_id int(11),FOREIGN KEY (p_id) REFERENCES product(id))";
        String sql = "create table if not exists sales(id int(11) auto_increment primary key, product_name varchar(50), product_code varchar(50), availableQty int(11), sold_qty double, unit_price double, total_price double, p_id int (11),FOREIGN KEY (p_id) REFERENCES products(id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Sales table created");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Sales s) {
        //  String sql = "insert into sales(product_name,product_code,qty,unit_price,total_price,sales_date,p_id) values(?,?,?,?,?,?,?)";
        String sql = "insert into sales(product_name,product_code,availableQty,sold_qty,unit_price,total_price,p_id) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, s.getProductName());
            pstm.setString(2, s.getProductCode());
            pstm.setDouble(3, s.getAvailableQty());
            pstm.setDouble(4, s.getSoldQty());
            pstm.setDouble(5, s.getUnitPrice());
            pstm.setDouble(6, s.getTotalPrice());
            pstm.setInt(7, s.getId());
            pstm.executeUpdate();
            System.out.println("inserted");
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
    public Sales getProdutById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getProductCodeByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sales> getList() {
        List<Sales> list = new ArrayList();
        String sql = "select * from sales";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                //int id, String productName, String productCode, double availableQty, double soldQty, double qty, double unitPrice, double totalPrice) {
                Sales sales = new Sales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7));
                list.add(sales);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
