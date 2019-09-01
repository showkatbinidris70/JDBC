package com.coderbd.daoImpl;

import com.coderbd.conn.CustomDbConnection;
import com.coderbd.dao.ProductDao;
import com.coderbd.pojo.Product;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDaoImpl implements ProductDao {

    Connection conn = CustomDbConnection.getConnection();

    public static void main(String[] args) {
        ProductDaoImpl pdi = new ProductDaoImpl();
        pdi.createTable();
    }

    @Override
    public void createTable() {
        /*
         public Product(int id, String productName, String productCode, int Qty, Double uniteprice, 
        Double totalPrice, int Stock, Date date) 
      
         */
        String sql = "create table if not exists product(id int(11) auto_increment primary key, product_name varchar(50),"
                + "product_code varchar(50), Qty int(11), unite_price double, total_price double, Stock int(11),purchase_date date)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            System.out.println("Product table created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Product p) {

        String sql = "insert into product(product_name ,product_code , Qty , unite_price , total_price ,"
                + " Stock ,purchase_date )values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, p.getProductName());
            pstmt.setString(2, p.getProductCode());
            pstmt.setInt(3, p.getQty());
            pstmt.setDouble(4, p.getUniteprice());
            pstmt.setDouble(5, p.getTotalPrice());
            pstmt.setInt(6, p.getStock());
            pstmt.setDate(7, p.getPurchaseDate());
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductByProductCode(String Code) {
        Product product = null;
        String sql = "select * from product where product_code=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, Code);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5),
                        rs.getDouble(6), rs.getInt(7), rs.getDate(8));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public List<Product> getlist() {

        List<Product> list = new ArrayList();
        String sql = "select * from product";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5),
                        rs.getDouble(6), rs.getInt(7), rs.getDate(8));
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
