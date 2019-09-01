/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

<<<<<<<HEAD
import com.coderbd.conn.ConnectionDBConnection;
import com.coderbd.dao.ProductDao;
import com.coderbd.pojo.Product;
import com.sun.jndi.ldap.Connection;

import java.sql.PreparedStatement;
import java.util.List;
=======
import com.coderbd.conn.CustomerDBConnection;
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
>>>>>>>1880a5098551963e5dfd3e13436e5e860a30f95b

/**
 *
 * @author User
 */
        <<<<<<<HEAD

public class ProductDaoImpl implements ProductDao {
    Connection conn = ConnectionDBConnection.

    @Override
    public void createTable() {
        //  PreparedStatement pstm = conn
=======
        public class ProductDaoImpl implements ProductDao {

            public static void main(String[] args) {
                ProductDaoImpl pd = new ProductDaoImpl();
                pd.createTable();
            }

            Connection con = CustomerDBConnection.getConnection();

            @Override
            public void createTable() {
                String sql = "create table IF NOT EXISTS product(id int(11) auto_increment primary key,product_name varchar(50), product_code varchar(50), qty int(11), unit_price double, total_price double)";
                try {
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.execute();
                    System.out.println("Table created");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

>>>>>>>1880 a5098551963e5dfd3e13436e5e860a30f95b
            }

            @Override
            public void save(Product p) {
<<<<<<<HEAD
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
                String sql = "insert into product (product_name,product_code,qty,unit_price,total_price) values(?,?,?,?,?)";
                try {
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, p.getProductName());
                    ps.setString(2, p.getProductCode());
                    ps.setInt(3, p.getQuantity());
                    ps.setDouble(4, p.getUnitPrice());
                    ps.setDouble(5, p.getTotalPrice());
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

>>>>>>>1880 a5098551963e5dfd3e13436e5e860a30f95b
            }

            @Override
            public void update(Product p) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
<<<<<<<HEAD

            public void dalete(Product p) {
=======
                public void dalete ( int id){
>>>>>>>1880 a5098551963e5dfd3e13436e5e860a30f95b
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
<<<<<<<HEAD
                public Product geProductById ( int id){
=======
                    public Product getProductById ( int id){
>>>>>>>1880 a5098551963e5dfd3e13436e5e860a30f95b
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
<<<<<<<HEAD
                    public Product getProductByProductCode (String code){
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
                        public Product getProductByCode (String code){
                            Product product = null;
                            String sql = "select * from product where product_code = ?";
                            try {
                                PreparedStatement pstm = con.prepareStatement(sql);
                                pstm.setString(1, code);
                                ResultSet rs = pstm.executeQuery();
                                while (rs.next()) {
                                    Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6));
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            return product;
>>>>>>>1880 a5098551963e5dfd3e13436e5e860a30f95b
                        }

                        @Override
                        public List<Product> getList () {
<<<<<<<HEAD
                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
    
=======
                        List<Product> list = new ArrayList();
                        String sql = "select * from product";
                        try {
                            PreparedStatement ps = con.prepareStatement(sql);
                            ResultSet rs = ps.executeQuery();
                            while (rs.next()) {
                                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6));
                                list.add(p);
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        return list;
                    }

>>>>>>>1880 a5098551963e5dfd3e13436e5e860a30f95b
                }
