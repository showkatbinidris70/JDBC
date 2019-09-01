/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.Product;

import java.util.List;

/**
 * @author User
 */
public interface ProductDao {

    void createTable();

    void save(Product p);

    void update(Product p);

    void dalete(int id);

    Product getProductById(int id);

    Product getProductByProductCode(String code);

    List<Product> getList();

}
