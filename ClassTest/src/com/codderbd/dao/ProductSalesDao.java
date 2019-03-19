/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codderbd.dao;

import com.codderbd.pojo.ProductSales;
import java.util.List;

/**
 *
 * @author User
 */
public interface ProductSalesDao {
    void createTable();

    void save(ProductSales ps);   

    ProductSales getProductSalesById(int id);

    ProductSales getProductSalesByProductCode(String code);   

    List<ProductSales> getList();
}
