/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.Product;
<<<<<<<HEAD
import java.util.ArrayList;
=======
        >>>>>>>1880a5098551963e5dfd3e13436e5e860a30f95b
import java.util.List;

/**
 * @author User
 */
public interface ProductDao {

    void createTable();

    void save(Product p);

    void update(Product p);

<<<<<<

    <HEAD
    void dalete(Product p);

    Product geProductById(int id);

    Product getProductByProductCode(String code);
=======

    void dalete(int id);

    Product getProductById(int id);

    Product getProductByCode(String code);
>>>>>>>1880a5098551963e5dfd3e13436e5e860a30f95b

    List<Product> getList();

}
