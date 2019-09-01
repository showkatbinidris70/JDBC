/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDAOImp {

    public static Connection connectDB() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evedence", "root", "1234");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    //this stmt for creating table through mysql command line
    //create table product(id int primary key auto_increment,name varchar(55),stock int,price double)

    //this stmt to insert data into table through mysql command line
    //"insert into product(name,stock,price) values("pen",100,10)
    public Product getProductById(int id) {
        Product product = null;
        String stmt = "select * from product where id=?";

        Connection conn = connectDB();

        try {
            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return product;
    }

    //This method for all product list
    public List<Product> getProductList() {
        List<Product> plist = new ArrayList<>();
        String stmt = "select * from product";

        Connection conn = connectDB();

        try {
            PreparedStatement ps = conn.prepareStatement(stmt);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                plist.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return plist;
    }

    //This method for finding current stock
    public int getStockById(int id) {
        int stock = 0;
        String stmt = "select stock from product where id=?";

        Connection conn = connectDB();

        try {
            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                stock = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return stock;
    }

    //This method will update product stock when sell or purchase will occur
    public void updateStock(int stock, int id) {
        String stmt = "update product set stock = ? where id=?";

        Connection conn = connectDB();

        try {
            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
