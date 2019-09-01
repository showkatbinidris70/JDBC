
package com.coderbd.dao;

import com.coderbd.pojo.Product;

import java.util.List;


public interface ProductDao {
    void createTable();

    void save(Product p);

    void update(Product p);

    void delete(int id);

    Product getProductById(int id);

    Product getProductByProductCode(String Code);

    List<Product> getlist();

}
