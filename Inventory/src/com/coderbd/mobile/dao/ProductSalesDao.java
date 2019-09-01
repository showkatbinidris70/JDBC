/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.mobile.dao;

import com.coderbd.mobile.domain.ProductSales;

import java.util.List;

/**
 * @author User
 */
public interface ProductSalesDao {
    void save(ProductSales s);

    void update(ProductSales s);

    void delete(int id);

    List<ProductSales> getList();

    ProductSales getProductSalesByID(int id);
}
