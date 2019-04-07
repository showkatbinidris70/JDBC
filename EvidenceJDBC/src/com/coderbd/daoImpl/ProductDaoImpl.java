/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.ConnectionDBConnection;
import com.coderbd.dao.ProductDao;
import com.coderbd.pojo.Product;
import com.sun.jndi.ldap.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author User
 */
public class ProductDaoImpl implements ProductDao{
    Connection conn = ConnectionDBConnection.
    @Override
    public void createTable() {
      //  PreparedStatement pstm = conn
    }

    @Override
    public void save(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dalete(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product geProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductByProductCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
