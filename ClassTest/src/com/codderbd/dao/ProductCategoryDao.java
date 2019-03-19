/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codderbd.dao;

import com.codderbd.pojo.ProductCategory;
import java.util.List;

/**
 *
 * @author User
 */
public interface ProductCategoryDao {
    void createTable();

    void save(ProductCategory pc);

    void update(ProductCategory pc);

    ProductCategory getProductCategoryById(int id);

    ProductCategory getProductCategoryBycategoryName(String catName);

    void delete(int id);

    List<ProductCategory> getList();
}
