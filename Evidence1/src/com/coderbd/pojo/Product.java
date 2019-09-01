/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

/**
 * @author User
 */
public class Product {

    private int id;
    private String productName;
    private String productCode;
    private int productQty;
    private double unitPrice;
    private double totalPrice;

    public Product() {
    }

    public Product(int id, String productName, String productCode, int productQty, double unitPrice, double totalPrice) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.productQty = productQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Product(String productName, String productCode, int productQty, double unitPrice, double totalPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.productQty = productQty;
        this.unitPrice = unitPrice;
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

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


}
