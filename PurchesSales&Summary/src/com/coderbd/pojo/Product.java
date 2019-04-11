/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

/**
 *
 * @author User
 */
public class Product {
   

    
     private int id;
    private String productName;
    private String productCode;
    private int quantity;
    private double unitPirce;
    private double totalPrice;

    public Product() {
    }
    public Product(int id, String productName, String productCode, int quantity, double unitPirce, double totalPrice) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.quantity = quantity;
        this.unitPirce = unitPirce;
        this.totalPrice = totalPrice;
    }

    public Product(String productName, String productCode, int quantity, double unitPirce, double totalPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.quantity = quantity;
        this.unitPirce = unitPirce;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPirce() {
        return unitPirce;
    }

    public void setUnitPirce(double unitPirce) {
        this.unitPirce = unitPirce;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
